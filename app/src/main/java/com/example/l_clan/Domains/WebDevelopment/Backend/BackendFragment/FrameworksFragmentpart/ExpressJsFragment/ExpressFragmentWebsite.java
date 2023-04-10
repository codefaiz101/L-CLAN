package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.ExpressJsFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class ExpressFragmentWebsite extends Fragment {


    public ExpressFragmentWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_express_youtube2, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendExpressResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendExpressResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendExpressResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendExpressResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendExpressResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/introduction-to-express/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/expressjs-tutorial");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/learn/learn-express");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/express-js/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/expressjs/index.htm");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}