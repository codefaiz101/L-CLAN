package com.example.l_clan.Domains.AndroidDevelopment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.l_clan.Domains.AndroidDevelopment.AndroidComponents.AndroidComponentsActivity;
import com.example.l_clan.Domains.AndroidDevelopment.AndroidStudio.AndroidStudioActivity;
import com.example.l_clan.Domains.AndroidDevelopment.DatabaseManagement.DatabaseManagementActivity;
import com.example.l_clan.Domains.AndroidDevelopment.Flutter.FlutterActivity;
import com.example.l_clan.Domains.AndroidDevelopment.Java.JavaActivity;
import com.example.l_clan.Domains.AndroidDevelopment.Kotlin.KotlinActivity;
import com.example.l_clan.Domains.AndroidDevelopment.Networking.NetworkingActivity;
import com.example.l_clan.Domains.AndroidDevelopment.ReactNative.ReactNativeActivity;
import com.example.l_clan.Domains.AndroidDevelopment.Security.SecurityActivity;
import com.example.l_clan.Domains.AndroidDevelopment.XML.XMLActivity;
import com.example.l_clan.R;

public class AppActivity extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        imageView1 = findViewById(R.id.JavaImage);
        imageView2 = findViewById(R.id.kotlin);
        imageView3 = findViewById(R.id.android_studio);
        imageView4 = findViewById(R.id.xml);
        imageView5 = findViewById(R.id.android_components);
        imageView6 = findViewById(R.id.database);
        imageView7 = findViewById(R.id.API);
        imageView8 = findViewById(R.id.security);
        imageView9 = findViewById(R.id.react_native);
        imageView10 = findViewById(R.id.flutter);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JavaActivity.class);
                Toast.makeText(AppActivity.this, "Opening Java Page", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), KotlinActivity.class);
                startActivity(intent);
            }
        });
//
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page .....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), AndroidStudioActivity.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), XMLActivity.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), AndroidComponentsActivity.class);
                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), DatabaseManagementActivity.class);
                startActivity(intent);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NetworkingActivity.class);
                startActivity(intent);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SecurityActivity.class);
                startActivity(intent);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ReactNativeActivity.class);
                startActivity(intent);
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AppActivity.this, "Opening Page.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), FlutterActivity.class);
                startActivity(intent);
            }
        });
    }
}

