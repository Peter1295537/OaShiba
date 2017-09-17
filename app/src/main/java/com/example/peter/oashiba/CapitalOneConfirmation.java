package com.example.peter.oashiba;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;



public class CapitalOneConfirmation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_one_confirmation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button signIn = (Button) findViewById(R.id.button_id);
        signIn.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                // get EditText by id and store it into "inputTxt"
                EditText inputTxt = (EditText) findViewById(R.id.capOneSignin);

                // Store EditText - Input in variable

                String name = inputTxt.getText().toString();
                logIn();

            }

        });

    }

    public void logIn() {
        Intent myIntent = new Intent(this, AccountSummary.class);
        startActivity(myIntent);
    }

}
