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


public class SeleninumFragmentYoutube extends Fragment {


    public SeleninumFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seleninum_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.SeleniumYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.SeleniumYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.SeleniumYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.SeleniumYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/FRn5J31eAMw");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL6flErFppaj2ArNxLyR4nQ4JV8qFc56-M");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}