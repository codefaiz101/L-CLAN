package com.example.l_clan.Domains.WebDevelopment;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendActivity;
import com.example.l_clan.Domains.WebDevelopment.Frontend.FrontendActivity;
import com.example.l_clan.R;

public class WebActivity extends AppCompatActivity {

// Toolbar toolbar;
 ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
//         toolbar = findViewById(R.id.webdevelopmenttoolbar);
//         setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Web Development");

//        toolbar = findViewById(R.id.webdevelopmenttoolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("WEB DVELOPMENT");

        imageView1 = findViewById(R.id.FrontendImage);
        imageView2 = findViewById(R.id.BackendImage);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrontendActivity.class);
                Toast.makeText(WebActivity.this, "Let Explore Frontend Development", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), BackendActivity.class);
                Toast.makeText(WebActivity.this, "Let Explore Backend Development", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }




}