package com.example.codex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class payment_page extends AppCompatActivity {
    private Button cod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_payment_page);

        cod = (Button) findViewById(R.id.cod);
        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(payment_page.this,,Toast.LENGTH_SHORT).show();
                openPage();
            }
        });
    }
    public void openPage(){
        Intent intentpag = new Intent(this,finalpage.class);
        startActivity(intentpag);

    }
}