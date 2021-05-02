package com.cbiel.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView foodDescription;
    ImageView foodImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDescription = (TextView)findViewById(R.id.txtDescription);
        foodImage = (ImageView)findViewById(R.id.ivImage2);

        Bundle foodBundle = getIntent().getExtras();

        if(foodBundle!=null){

            foodDescription.setText(foodBundle.getString("Description"));
            foodImage.setImageResource(foodBundle.getInt("Image"));

        }
    }
}