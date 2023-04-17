package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_Libraries_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class NN_Libraries_Pytorch_Fragment_Website extends Fragment {


    public NN_Libraries_Pytorch_Fragment_Website() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_n_n__libraries__pytorch___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.NN_Libraries_Pytorch_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.NN_Libraries_Pytorch_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.NN_Libraries_Pytorch_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.NN_Libraries_Pytorch_ResourceImage4);
        ImageView imageView5 = view.findViewById(R.id.NN_Libraries_Pytorch_ResourceImage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://pytorch.org/tutorials/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/pytorch");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/pytorch/index.htm");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://machinelearningmastery.com/pytorch-tutorial-develop-deep-learning-models/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://github.com/yunjey/pytorch-tutorial");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}