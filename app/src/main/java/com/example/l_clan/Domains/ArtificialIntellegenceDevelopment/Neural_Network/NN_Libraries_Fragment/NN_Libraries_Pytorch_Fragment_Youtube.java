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


public class NN_Libraries_Pytorch_Fragment_Youtube extends Fragment {


    public NN_Libraries_Pytorch_Fragment_Youtube() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_n_n__libraries__pytorch___youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.NN_Libraries_Pytorch_YT_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.NN_Libraries_Pytorch_YT_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.NN_Libraries_Pytorch_YT_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.NN_Libraries_Pytorch_YT_ResourceImage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/GIsg-ZUy0MY");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLqnslRFeH2UrcDBWF5mfPGpqQDSta6VK4");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLZbbT5o_s2xrfNyHZsM6ufI0iZENK9xgG");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/Z_ikDlimN6A");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}