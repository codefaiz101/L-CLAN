package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_C_Plus_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class Ai_C_Plus_Fragment_Website extends Fragment {


    public Ai_C_Plus_Fragment_Website() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ai__c__plus___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.Ai_c_plus_Resourceimage1);
        ImageView imageView2 = view.findViewById(R.id.Ai_c_plus_Resourceimage2);
        ImageView imageView3 = view.findViewById(R.id.Ai_c_plus_Resourceimage3);
        ImageView imageView4 = view.findViewById(R.id.Ai_c_plus_Resourceimage4);
        ImageView imageView5 = view.findViewById(R.id.Ai_c_plus_Resourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.com/cpp/default.asp");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/cpp-tutorial/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/cpp-tutorial");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/c-2/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/cplusplus/index.htm");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}