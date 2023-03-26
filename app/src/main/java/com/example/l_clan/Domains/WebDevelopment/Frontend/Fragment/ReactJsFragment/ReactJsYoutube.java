package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.ReactJsFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class ReactJsYoutube extends Fragment {



    public ReactJsYoutube() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_react_js_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.RjsYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.RjsYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.RjsYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.RjsYtResourceimage4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=cd3P3yXyx30");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL05sYGJyIXMp9a1a8fqYhUpdgcCAD8SJd");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=oFBuPWCjbA4&list=PLSsAz5wf2lkK_ekd0J__44KG6QoXetZza");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=-mJFZp84TIY&list=PLu0W_9lII9agx66oZnT6IyhcMIbUMNMdt");
            }
        });


        return  view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}