package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.TestingtoolsFragmentpart.SeleninumFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class SeleninumFragmentWebsite extends Fragment {


    public SeleninumFragmentWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seleninum_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendSeleniumResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendSeleniumResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendSeleniumResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendSeleniumResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendSeleniumResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/selenium-tutorial");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/selenium/index.htm");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.guru99.com/selenium-tutorial.html");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.lambdatest.com/blog/selenium-webdriver-tutorial-with-examples/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://artoftesting.com/selenium-tutorial");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}