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


public class TailwindCSSYoutube extends Fragment {


    public TailwindCSSYoutube() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tailwind_c_s_s_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.TWYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.TWYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.TWYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.TWYtResourceimage4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=L4_jarMnB0c&list=PLu0W_9lII9ahwFDuExCpPFHAK829Wto2O");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=6LhRLZ5_IgI&list=PLjVLYmrlmjGfpwYhVAbiGAhFl6h8XWDV_");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLwGdqUZWnOp3l8tWTcB7R7Bsgd86lCa8a");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=bxmDnn7lrnk&list=PL4cUxeGkcC9gpXORlEHjc5bgnIi5HEGhw");
            }
        });
        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}