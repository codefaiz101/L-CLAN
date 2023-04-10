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

public class JestFragmentWebsite extends Fragment {

    public JestFragmentWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jest_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendJestResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendJestResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendJestResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendJestResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendJestResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/testing-with-jest/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3resource.com/jest/introduction.php");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.lambdatest.com/jest");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/jest-framework");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/learn/learn-react-testing/modules/jest/cheatsheet");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}