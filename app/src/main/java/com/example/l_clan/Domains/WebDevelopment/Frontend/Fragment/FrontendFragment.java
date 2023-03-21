package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.l_clan.R;

public class FrontendFragment extends AppCompatActivity {

    Button btnone,btntwo;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_frontend_fragment);
        btnone=findViewById(R.id.websitesbtn);
        btntwo=findViewById(R.id.youtubebtn);
        linearLayout = findViewById(R.id.htmllinerlayout);


        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HTMLWebsite htmlWebsite = new HTMLWebsite();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.htmllinerlayout,htmlWebsite);
                transaction.commit();
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HTMLYoutube htmlYoutube = new HTMLYoutube();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.htmllinerlayout,htmlYoutube);
                transaction1.commit();
            }
        });



    }
}