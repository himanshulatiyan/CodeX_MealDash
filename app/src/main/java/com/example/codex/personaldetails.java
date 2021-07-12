package com.example.codex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class personaldetails extends AppCompatActivity {
    private Button submit;
    EditText namepd,phonepd,emailpd,addresspd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_personaldetails);

        namepd =(EditText) findViewById(R.id.namePD);
        phonepd =(EditText) findViewById(R.id.phonePD);
        emailpd =(EditText) findViewById(R.id.emailPD);
        addresspd =(EditText) findViewById(R.id.addressPD);


        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariable.NamePrr=namepd.getText().toString();
                GlobalVariable.PhonePrr=phonepd.getText().toString();
                GlobalVariable.EmailPrr=emailpd.getText().toString();
                GlobalVariable.AddressPrr=addresspd.getText().toString();
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intentsu = new Intent(this, MainActivity.class);
        startActivity(intentsu);
    }
}