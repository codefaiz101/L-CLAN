package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_Keras_Libraries_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class Ml_Keras_Fragment_Youtube extends Fragment {


    public Ml_Keras_Fragment_Youtube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ml__keras___youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_Keras_YT_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.ML_Keras_YT_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.ML_Keras_YT_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.ML_Keras_YT_ResourceImage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLeo1K3hjS3uu7CxAacxVndI4bE_o3BDtO");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/qFJeN9V1ZsI");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLQVvvaa0QuDfhTox0AjmQ6tvTgMBZBEXN");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/XNKeayZW4dY");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}