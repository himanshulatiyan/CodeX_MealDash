package com.example.codex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodDetail extends AppCompatActivity {
    private Button feed,addtoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_food_detail);

        feed = (Button) findViewById(R.id.buttonf);
        addtoc = (Button) findViewById(R.id.button);
        addtoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodDetail.this, "Added To Cart", Toast.LENGTH_SHORT).show();
            }
        });
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextPage();
            }
        });

        Intent intent = getIntent();
        Integer Image = intent.getIntExtra("Image", 0);
        String Name = intent.getStringExtra("Name");
        String Rating = intent.getStringExtra("Rating");
        String Price = intent.getStringExtra("Price");
        String Description = intent.getStringExtra("Description");

        ImageView foodimageview = findViewById(R.id.displayImage);
        foodimageview.setImageResource(Image);

        TextView nametextView = findViewById(R.id.displayName);
        nametextView.setText(Name);

        TextView ratingtextView = findViewById(R.id.displayRating);
        ratingtextView.setText(Rating);

        TextView pricetextView = findViewById(R.id.displayPrice);
        pricetextView.setText(Price);

        TextView desctextView = findViewById(R.id.desccc);
        desctextView.setText(Description);
    }
    public void openNextPage() {
        Intent intentfi = new Intent(this,feedback.class);
        startActivity(intentfi);
    }
}