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


public class Ml_TensorFlow_Fragment_Website extends Fragment {


    public Ml_TensorFlow_Fragment_Website() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ml__tensor_flow___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_Tensorflow_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.ML_Tensorflow_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.ML_Tensorflow_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.ML_Tensorflow_ResourceImage4);
        ImageView imageView5 = view.findViewById(R.id.ML_Tensorflow_ResourceImage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tensorflow.org/tutorials");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/tensorflow");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/tensorflow/index.htm");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.guru99.com/tensorflow-tutorial.html");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.simplilearn.com/tutorials/deep-learning-tutorial/tensorflow");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}