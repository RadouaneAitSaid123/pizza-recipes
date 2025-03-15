// ProductDetailActivity.java
package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ProductDetailActivity extends AppCompatActivity {

    private ImageView image;
    private TextView nom;
    private TextView desc;
    private TextView ingred;
    private TextView prep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail_activity);
        Intent intent = getIntent();
        nom = findViewById(R.id.pizza_name);
        ingred = findViewById(R.id.ingred);
        prep = findViewById(R.id.prep);
        desc = findViewById(R.id.desc);
        image = findViewById(R.id.image_pizza);


        nom.setText(intent.getStringExtra("nom"));
        ingred.setText(intent.getStringExtra("ingredients"));
        desc.setText(intent.getStringExtra("description"));
        prep.setText(intent.getStringExtra("etapes"));
        image.setImageResource(intent.getIntExtra("image", R.mipmap.ic_launcher));
    }
}