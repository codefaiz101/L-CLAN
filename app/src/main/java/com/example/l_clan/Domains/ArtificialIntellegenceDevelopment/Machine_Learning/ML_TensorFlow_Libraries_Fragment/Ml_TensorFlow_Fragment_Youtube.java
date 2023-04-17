package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_TensorFlow_Libraries_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class Ml_TensorFlow_Fragment_Youtube extends Fragment {


    public Ml_TensorFlow_Fragment_Youtube() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ml__tensor_flow___youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_Tensorflow_YT_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.ML_Tensorflow_YT_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.ML_Tensorflow_YT_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.ML_Tensorflow_YT_ResourceImage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/tPYj3fFJGjk");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLeo1K3hjS3uu7CxAacxVndI4bE_o3BDtO");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/tpCFfeUEGs8");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLhhyoLH6IjfxVOdVC1P1L5z5azs0XjMsb");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}