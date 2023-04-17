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


public class Ml_Scikit_Learn_Fragment_Youtube extends Fragment {


    public Ml_Scikit_Learn_Fragment_Youtube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ml__scikit__learn___youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_Scikitlearn_YT_Resourceimage1);
        ImageView imageView2 = view.findViewById(R.id.ML_Scikitlearn_YT_Resourceimage2);
        ImageView imageView3 = view.findViewById(R.id.ML_Scikitlearn_YT_Resourceimage3);
        ImageView imageView4 = view.findViewById(R.id.ML_Scikitlearn_YT_Resourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL5-da3qGB5ICeMbQuqbbCOQWcS6OYBr5A");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLQVvvaa0QuDd0flgGphKCej-9jp-QdzZ3");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/pqNCD_5r0IU");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/0Lt9w-BxKFQ");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}