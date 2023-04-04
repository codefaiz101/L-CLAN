package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.AngularFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class AngularWebsite extends Fragment {



    public AngularWebsite() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_angular_website, container, false);

        ImageView imageView1 = view.findViewById(R.id.AjswebResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.AjswebResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.AjswebResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.AjswebResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.AjswebResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.com/angular/");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/angular-8-introduction/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/angular-8");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/learn/learn-angularjs");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/angularjs/");
            }
        });

        return  view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}