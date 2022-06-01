package com.example.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.shopping.Adapter.CategoryAdapter;
import com.example.shopping.Adapter.RecommendedAdapter;
import com.example.shopping.Domain.CategoryDomain;
import com.example.shopping.Domain.FoodDomain;
import com.example.shopping.R;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategotyList, recyclerViewPopularList;
    ConstraintLayout btnOrder;
    private EditText searchItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       String db="select * from ";
        recyclerViewCategoty();
        recyclerViewPopular();
        bottomNavigation();
        btnOrder=findViewById(R.id.btnOrder);
         btnOrder.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(MainActivity.this,MainActivity.class));

             }
         });
    }
    private void bottomNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);
        LinearLayout actProfile = findViewById(R.id.actProfile);
        LinearLayout btnSupport = findViewById(R.id.btnSupport);
        ImageView btn=findViewById(R.id.imagePofile);


        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
                homeBtn.setBackgroundColor(Color.rgb(255,144,0));
                cartBtn.setBackgroundColor(Color.WHITE);

            }
        });

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartActivity.class));
                cartBtn.setBackgroundColor(Color.rgb(255,144,0));
                homeBtn.setBackgroundColor(Color.WHITE);

            }
        });
        actProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));

            }
        });
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SupportActivity.class));

            }
        });
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.view2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodlist = new ArrayList<>();
        foodlist.add(new FoodDomain("Pepperoni pizza", "pizza", "slices pepperoni ,mozzarella cheese, fresh oregano,  ground black pepper, pizza sauce", 13.0, 5, 20, 1000));
        foodlist.add(new FoodDomain("Chesse Burger", "burger", "beef, Gouda Cheese, Special sauce, Lettuce, tomato ", 15.20, 4, 18, 1500));
        foodlist.add(new FoodDomain("Vagetable Hotdog", "hotdog", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));
        foodlist.add(new FoodDomain("Drinks", "drink", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));
        foodlist.add(new FoodDomain("Donut", "donut", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));
        foodlist.add(new FoodDomain("Fries", "fries", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));
        foodlist.add(new FoodDomain("Fried Eggs", "fried_eggs", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));
        foodlist.add(new FoodDomain("Grilled Chicken", "grilled_chicken", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));
        foodlist.add(new FoodDomain("Juice", "juice", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));

        adapter2 = new RecommendedAdapter(foodlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerViewCategoty() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategotyList = findViewById(R.id.view1);
        recyclerViewCategotyList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza", "pizza"));
        categoryList.add(new CategoryDomain("Drink", "burger"));
        categoryList.add(new CategoryDomain("Hotdog", "hotdog"));
        categoryList.add(new CategoryDomain("Salad", "sald"));
        categoryList.add(new CategoryDomain("Drink", "drink"));
        categoryList.add(new CategoryDomain("Coca-Cola", "sald"));
        categoryList.add(new CategoryDomain("Juice", "juice"));
        categoryList.add(new CategoryDomain("Grilled", "grilled_chicken"));
        categoryList.add(new CategoryDomain("Eggs", "fried_eggs"));
        categoryList.add(new CategoryDomain("Fries", "fries"));
        searchItems=findViewById(R.id.searchItems);

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategotyList.setAdapter(adapter);

    }
}