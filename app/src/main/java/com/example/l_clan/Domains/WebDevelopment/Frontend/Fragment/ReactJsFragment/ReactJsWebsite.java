package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.ReactJsFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class ReactJsWebsite extends Fragment {



    public ReactJsWebsite() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_react_js_website, container, false);
        ImageView imageView = view.findViewById(R.id.RjswebResourceimage1);
        ImageView imageView1 = view.findViewById(R.id.RjswebResourceimage2);
        ImageView imageView2 = view.findViewById(R.id.RjswebResourceimage3);
        ImageView imageView3 = view.findViewById(R.id.RjswebResourceimage4);
        ImageView imageView4 = view.findViewById(R.id.RjswebResourceimage5);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.com/REACT/DEFAULT.ASP");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/reactjs-tutorials/");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/reactjs-tutorial");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/learn/react-101");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/react/");
            }
        });
        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}