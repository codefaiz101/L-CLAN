package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.TestingtoolsFragmentpart.JestFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class JestFragmentYoutube extends Fragment {


    public JestFragmentYoutube() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jest_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.JestYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.JestYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.JestYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.JestYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLC3y8-rFHvwirqe1KHFCHJ0RqNuN61SJd");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/7r4xVDI2vho");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/ajiAl5UNzBU");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLxnSeqQVewBNZnDbkokG8QIyEAtMCzoq-");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}