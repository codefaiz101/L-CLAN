package com.example.l_clan.Domains.WebDevelopment.Frontend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.l_clan.R;
import com.example.l_clan.sampleActivity;

public class FrontendActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend);
        imageView = findViewById(R.id.Frontendtechnology);
        
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrontendTechnologyActivity.class);
                Toast.makeText(FrontendActivity.this, "Here The Resources are!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                
            }
        });
    }
}