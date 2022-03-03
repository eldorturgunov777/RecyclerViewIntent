package com.example.recyclerviewintent.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewintent.R;

public class SecondActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = findViewById(R.id.iv_image);
        textView = findViewById(R.id.tv_title);
        extras = getIntent().getExtras();

        if (extras != null) {
            String title = extras.getString("title");
            int image = extras.getInt("img");
            
            textView.setText(title);
            imageView.setImageResource(image);
        }
    }
}