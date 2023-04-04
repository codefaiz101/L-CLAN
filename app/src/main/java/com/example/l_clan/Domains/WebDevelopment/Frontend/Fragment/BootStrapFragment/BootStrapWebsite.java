package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.BootStrapFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class BootStrapWebsite extends Fragment {



    public BootStrapWebsite() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_boot_strap_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BswebResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BswebResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BswebResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BswebResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BswebResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.com/bootstrap/");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/bootstrap/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/bootstrap-tutorial");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/learn/learn-bootstrap");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/full-bootstrap-5-tutorial-for-beginners/");
            }
        });


        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}