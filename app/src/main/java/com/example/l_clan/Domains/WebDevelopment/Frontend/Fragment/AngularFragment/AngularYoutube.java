package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.AngularFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class AngularYoutube extends Fragment {


    public AngularYoutube() {
        // Required empty public constructor
    }

   

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_amgular_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.AjsYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.AjsYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.AjsYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.AjsYtResourceimage4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=CGLdH5ORX-Y");
            }

        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=3qBXWUpoPHo");
            }

        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=0LhBvp8qpro");
            }

        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=NMzl2pGOK_8&list=PL1BztTYDF-QNrtkvjkT6Wjc8es7QB4Gty");
            }

        });


        return  view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}