package com.example.hieuduong.app2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetMenu extends AppCompatActivity {

    private Button getMenuBtn;
    private EditText menuString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_menu);

        menuString = (EditText) findViewById(R.id.menuString);
        getMenuBtn = (Button) findViewById(R.id.getMenuBtn);

        getMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetMenuClass().execute();
            }
        });
    }

    private class GetMenuClass extends AsyncTask<String, Void, String> {

        protected void onPreExecute() {
            super.onPreExecute();

        }

        protected String doInBackground(String... params) {

            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String jsonStr = sh.getMenu();
            return jsonStr;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            menuString.setText(result);
        }
    }
}
