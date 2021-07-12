package com.example.codex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.codex.menu.VegS.Foodparams;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView Cart;
    RecyclerView recyclerView, recyclerView2;
    LinearLayoutManager linearLayoutManager, linearLayoutManager2;
    List<RecItems> recItemsList;
    List<MenuItems> menuItemsList;
    RecAdapter adapter;
    MenuAdapter adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        EditText SearchBar = findViewById(R.id.SearchBar);
        SearchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

        initData();
        initRecyclerView();
        initData2();
        initRecyclerView2();


        Cart = findViewById(R.id.Cart);
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"You Clicked", Toast.LENGTH_SHORT).show();
                opencartactivity();
            }
        });
    }

    private void filter(String text){
        ArrayList<RecItems> filteredList = new ArrayList<>();
        for(RecItems item : recItemsList){
            if(item.getRecFoodName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }
    // menu
    private void initData2() {

        menuItemsList = new ArrayList<>();
        menuItemsList.add(new MenuItems(R.drawable.paneertikka, "Veg Starters"));
        menuItemsList.add(new MenuItems(R.drawable.chickentikka, "Non-Veg Starters"));
        menuItemsList.add(new MenuItems(R.drawable.kadhaipaneer,"Veg Main Course"));
        menuItemsList.add(new MenuItems(R.drawable.chickentikka,"Non-Veg Main Course"));
        menuItemsList.add(new MenuItems(R.drawable.naan, "Breads"));
        menuItemsList.add(new MenuItems(R.drawable.jeerarice, "Rice"));
        menuItemsList.add(new MenuItems(R.drawable.vegbiryani, "Biryani"));
        menuItemsList.add(new MenuItems(R.drawable.friedpapad, "Accompaniments"));
        menuItemsList.add(new MenuItems(R.drawable.icecream, "Desserts"));
        menuItemsList.add(new MenuItems(R.drawable.lemonade, "Beverages"));
        menuItemsList.add(new MenuItems(R.drawable.chocoshake, "Milkshakes"));
        menuItemsList.add(new MenuItems(R.drawable.virginmojito, "Mocktails"));
    }

    private void initRecyclerView2() {
        recyclerView2 = findViewById(R.id.MenuRecyclerView);
        linearLayoutManager2 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        adapter2 = new MenuAdapter (MainActivity.this, menuItemsList);
        recyclerView2.setAdapter(adapter2);
        adapter2.notifyDataSetChanged();
    }

    private void initData() {

        recItemsList = new ArrayList<>();
        recItemsList.add(new RecItems(R.drawable.paneertikka, "Paneer Tikka", "4.4","Rs. 220","Paneer Tikka is a popular and delicious tandoori snack where paneer (Indian cottage cheese cubes) are marinated in a spiced yogurt-based marinade, arranged on skewers and grilled in the oven."));
        recItemsList.add(new RecItems(R.drawable.vegbiryani, "Chicken Biryani", "4.2","Rs. 330","This biryani has mild fragrance, sticky rice, distinct taste of rice with hot and tangy flavour along with soft meat or vegetables."));
        recItemsList.add(new RecItems(R.drawable.chickentikka, "Chicken Tikka", "4.2","Rs. 330","Dish consisting of marinated boneless chicken pieces that are traditionally cooked in a tandoor and then served in a subtly spiced tomato-cream sauce."));
        recItemsList.add(new RecItems(R.drawable.butterchicken,"Butter Chicken", "4", "Rs. 430","Its mildly spicy, creamy, savoury flavour makes it more than just delicious, but accessible to almost every palate."));
        recItemsList.add(new RecItems(R.drawable.pansandwich,"Paneer Sandwich","4.1","Rs. 210","Paneer sandwich is a quick, delicious and protein-packed Indian sandwich made with crumbled paneer (Indian cheese), spices, veggies, herbs and bread. This paneer sandwich makes for a quick breakfast or snack and is kids’ friendly."));
        recItemsList.add(new RecItems(R.drawable.soyachap,"Soya Chap","4.3","Rs. 250","It is a delicious North Indian starter where soya chaap is cut into small pieces and then mixed with a marination of hung curd, ginger garlic paste, Kashmiri red chilli powder, turmeric powder, tandoori masala, chaat masala, black pepper powder, salt, garam masala powder, kasuri methi, butter, fresh cream and lemon juice."));
        recItemsList.add(new RecItems(R.drawable.rasgulla,"Rasgulla","4.5","Rs. 20(per piece)","Rasgulla is an Indian dessert made of cheese. It basically consists of boiled milk. Rasgulla comes in the form of small, airy white balls that have a sweet flavor."));
        recItemsList.add(new RecItems(R.drawable.oreo,"Oreo Milkshake","4.3","Rs. 120",""));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.RecRecyclerView);
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new RecAdapter(MainActivity.this, recItemsList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void opencartactivity(){
        Intent intent= new Intent(this, Cart_Activity.class);
        startActivity(intent);
    }
}