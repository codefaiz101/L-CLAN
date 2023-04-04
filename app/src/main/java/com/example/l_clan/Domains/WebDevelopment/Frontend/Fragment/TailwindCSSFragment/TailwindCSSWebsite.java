package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.TailwindCSSFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class TailwindCSSWebsite extends Fragment {



    public TailwindCSSWebsite() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tailwind_c_s_s_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.TWwebResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.TWwebResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.TWwebResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.TWwebResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.TWwebResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://tailwindcss.com/");

            }


        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/tailwind-css/");
            }


        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/tailwind/");
            }


        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/learn/learn-css");
            }


        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://scrimba.com/learn/tailwind");
            }


        });
        return  view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}