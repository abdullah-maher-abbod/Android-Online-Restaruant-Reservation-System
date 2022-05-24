package com.example.safedining;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Res_page extends AppCompatActivity {

    private ImageView imageView;
    TextView name,category,rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_page);

        imageView = findViewById(R.id.iv_r_item_res);
        name = findViewById(R.id.title_r_res);
        category = findViewById(R.id.category_res);
        rate = findViewById(R.id.rate_res);
    }
}