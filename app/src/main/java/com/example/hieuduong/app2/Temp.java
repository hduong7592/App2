package com.example.hieuduong.app2;

import android.net.Uri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by hieuduong on 12/3/17.
 */

public class Temp {
    /*

    package com.example.hieuduong.app2;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private EditText emailTxt, passwordTxt;
    private Button loginBtn;
    protected TextView resultView;
    protected String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailTxt = (EditText) findViewById(R.id.emailTxt);
        passwordTxt = (EditText) findViewById(R.id.passwordTxt);
        resultView = (TextView) findViewById(R.id.resultLB);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = emailTxt.getText().toString();
                password = passwordTxt.getText().toString();

                resultView.setText(email +" "+password);
                new Login().execute();
            }
        });
    }

    private class Login extends AsyncTask<String, Void, String> {

        protected void onPreExecute() {
            super.onPreExecute();

        }

        protected String doInBackground(String... params) {


            //HttpURLConnection conn = null;
            //BufferedReader reader = null;

            try {

                /*
                URL url = new URL("https://www.siam-classic.com/signin");
                try {
                    conn = (HttpURLConnection) url.openConnection();
                    conn.connect();

                }
                catch (Exception ex){

                }
                InputStream stream = conn.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null) {
                    buffer.append(line+"\n");
                    Log.d("Response: ", "> " + line);   //here u ll get whole response...... :-)

                }

                return buffer.toString();

    String response = "";
    URL url = new URL("https://www.siam-classic.com/signin");
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
                conn.setReadTimeout(10000);
                conn.setConnectTimeout(15000);
                conn.setRequestMethod("POST");
                conn.setDoInput(true);
                conn.setDoOutput(true);

    Uri.Builder builder = new Uri.Builder()
            .appendQueryParameter("email", email)
            .appendQueryParameter("password", password);
    String query = builder.build().getEncodedQuery();

    OutputStream os = conn.getOutputStream();
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
                writer.write(query);
                writer.flush();
                writer.close();
                os.close();

                conn.connect();

    int responseCode=conn.getResponseCode();

                if (responseCode == HttpsURLConnection.HTTP_OK) {
        String line;
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while ((line=br.readLine()) != null) {
            response+=line;
        }
    }
                else {
        response="";

    }
                return response;

} catch (MalformedURLException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        } finally {

        }
        return null;
        }

@Override
protected void onPostExecute(String result) {
        super.onPostExecute(result);

        resultView.setText(result);
        }
        }
        }

        */
}
