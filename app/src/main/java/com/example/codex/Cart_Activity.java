package com.example.codex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Cart_Activity extends AppCompatActivity {
    private Button proceed;
    ImageView Profile;
    RecyclerView recyclerView9;
    LinearLayoutManager linearLayoutManager9;
    List<RecItems> recItemsList;
    CartAdapter adapter9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cart);

        proceed = (Button) findViewById(R.id.proceedtopay);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPay();
            }
        });
        initData9();
        initRecyclerView9();

        Profile = findViewById(R.id.profilep);
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }
    public void openPay(){
        Intent intentptp = new Intent(this, payment_page.class);
        startActivity(intentptp);
    }

    private void initData9() {
        recItemsList = new ArrayList<>();
        recItemsList.add(new RecItems(R.drawable.paneertikka, "Paneer Tikka", "4.4","Rs. 220","Paneer Tikka is a popular and delicious tandoori snack where paneer (Indian cottage cheese cubes) are marinated in a spiced yogurt-based marinade, arranged on skewers and grilled in the oven."));
        recItemsList.add(new RecItems(R.drawable.vegbiryani, "Chicken Biryani", "4.2","Rs. 330","This biryani has mild fragrance, sticky rice, distinct taste of rice with hot and tangy flavour along with soft meat or vegetables."));
        recItemsList.add(new RecItems(R.drawable.chickentikka, "Chicken Tikka", "4.2","Rs. 330","Dish consisting of marinated boneless chicken pieces that are traditionally cooked in a tandoor and then served in a subtly spiced tomato-cream sauce."));
        recItemsList.add(new RecItems(R.drawable.butterchicken,"Butter Chicken", "4", "Rs. 430","Its mildly spicy, creamy, savoury flavour makes it more than just delicious, but accessible to almost every palate."));
        recItemsList.add(new RecItems(R.drawable.oreo,"Oreo Milkshake","4.3","Rs. 120",""));
    }
    private void initRecyclerView9() {
        recyclerView9 = findViewById(R.id.CartRecyclerView);
        linearLayoutManager9 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView9.setLayoutManager(linearLayoutManager9);
        adapter9 = new CartAdapter(Cart_Activity.this, recItemsList);
        recyclerView9.setAdapter(adapter9);
        adapter9.notifyDataSetChanged();
    }

    public void openProfile(){
        Intent intentpp = new Intent(this, profile.class);
        startActivity(intentpp);
    }
}