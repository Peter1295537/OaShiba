package com.example.peter.oashiba;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.button_id);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // get EditText by id and store it into "inputTxt"
                EditText inputTxt = (EditText) findViewById(R.id.edittext);

                // Store EditText - Input in variable

                String name = inputTxt.getText().toString();
                if (name.equals("Peter")){
                    logIn();
                }

            }

        });

    }

    public void logIn() {
        Intent myIntent = new Intent(this, AccountSummary.class);
        startActivity(myIntent);
    }


}
