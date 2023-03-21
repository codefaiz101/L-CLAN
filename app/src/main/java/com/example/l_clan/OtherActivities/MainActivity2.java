package com.example.l_clan.OtherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.l_clan.R;

public class MainActivity2 extends AppCompatActivity {
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.temid);
//        textView = findViewById(R.id.temid);
        Intent intent = getIntent();
        String domain = intent.getStringExtra("Domain");
        textView.setText(domain);

    }
//    public void showdomain(View view){
//
//    }
}