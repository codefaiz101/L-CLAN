package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.WebServersFragementpart.ApacheFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class ApacheFragmentWebsite extends Fragment {


    public ApacheFragmentWebsite() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_apache_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendApacheResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendApacheResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendApacheResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendApacheResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendApacheResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/apache_httpclient/index.htm");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.twaino.com/en/blog/website-creation/apache-server-2/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.guru99.com/apache.html");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialride.com/apache-http-server/apache-http-server-tutorial.htm");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.hostinger.in/tutorials/what-is-apache");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}