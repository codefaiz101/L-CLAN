package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_Scikit_Learn_Libraries_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class Ml_Scikit_Learn_Fragment_Website extends Fragment {


    public Ml_Scikit_Learn_Fragment_Website() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ml__scikit__learn___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_Scikitlearn_Resourceimage1);
        ImageView imageView2 = view.findViewById(R.id.ML_Scikitlearn_Resourceimage2);
        ImageView imageView3 = view.findViewById(R.id.ML_Scikitlearn_Resourceimage3);
        ImageView imageView4 = view.findViewById(R.id.ML_Scikitlearn_Resourceimage4);
        ImageView imageView5 = view.findViewById(R.id.ML_Scikitlearn_Resourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://scikit-learn.org/stable/tutorial/index.html");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/sklearn-tutorial");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/scikit_learn/index.htm");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.simplilearn.com/tutorials/python-tutorial/scikit-learn");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.guru99.com/scikit-learn-tutorial.html");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}