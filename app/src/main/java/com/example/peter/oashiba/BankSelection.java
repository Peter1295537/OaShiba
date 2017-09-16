package com.example.peter.oashiba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BankSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_selection);

        Button capOne = (Button) findViewById(R.id.CapitalOne);

        capOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                selectCapOne();
            }

        });
    }

    public void selectCapOne() {
        Intent myIntent = new Intent(this, CapitalOneConfirmation.class);
        startActivity(myIntent);
    }
}
