package com.example.codex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class profile extends AppCompatActivity {
    TextView NameProfile,PhoneProfile,EmailProfile,AddressProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);

        NameProfile = (TextView) findViewById(R.id.NameProfile);
        PhoneProfile = (TextView) findViewById(R.id.PhoneProfile);
        EmailProfile = (TextView) findViewById(R.id.EMailProfile);
        AddressProfile = (TextView) findViewById(R.id.AddressProfile);
        NameProfile.setText(GlobalVariable.NamePrr);
        PhoneProfile.setText(GlobalVariable.PhonePrr);
        EmailProfile.setText(GlobalVariable.EmailPrr);
        AddressProfile.setText(GlobalVariable.AddressPrr);
    }
}