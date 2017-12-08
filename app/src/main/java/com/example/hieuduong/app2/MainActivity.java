package com.example.hieuduong.app2;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private EditText emailTxt, passwordTxt;
    private Button loginBtn;
    protected TextView resultView;
    protected String email, password;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailTxt = (EditText) findViewById(R.id.emailTxt);
        passwordTxt = (EditText) findViewById(R.id.passwordTxt);
        resultView = (TextView) findViewById(R.id.resultLB);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        pb = (ProgressBar) findViewById(R.id.progressBar);
        pb.setVisibility(View.GONE);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = emailTxt.getText().toString();
                password = passwordTxt.getText().toString();

                resultView.setText(email +" "+password);
                pb.setVisibility(View.VISIBLE);
                new Login().execute();
            }
        });
    }

    private class Login extends AsyncTask<String, Void, String> {

        protected void onPreExecute() {
            super.onPreExecute();

        }

        protected String doInBackground(String... params) {

            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String jsonStr = sh.Login(email, password);
            return jsonStr;

        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            pb.setVisibility(View.GONE);
            //resultView.setText(result);

            if(result != null){
                //ResultLB.setText(result);


                try {
                    JSONObject jsonObj = new JSONObject(result);

                    boolean success = jsonObj.getBoolean("success");

                    if(success){
                        resultView.setText(result);

                        Intent myintent = new Intent(MainActivity.this, GetMenu.class);
                        startActivity(myintent);
                    }
                    else{
                        String message = jsonObj.getString("message");
                        Toast.makeText(MainActivity.this,message, Toast.LENGTH_SHORT).show();
                    }

                } catch (final JSONException e) {

                    Toast.makeText(MainActivity.this,e.toString(), Toast.LENGTH_SHORT).show();
                }


            }else{
                Toast.makeText(MainActivity.this,"Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
