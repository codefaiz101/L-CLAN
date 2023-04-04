package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.CSSFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class CSSYoutube extends Fragment {

    public CSSYoutube(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_c_s_s_youtube, container, false);
      ImageView imageView = view.findViewById(R.id.CSSYtResourceimage1);
        ImageView imageView1 = view.findViewById(R.id.CSSYtResourceimage2);
        ImageView imageView2 = view.findViewById(R.id.CSSYtResourceimage3);
        ImageView imageView3 = view.findViewById(R.id.CSSYtResourceimage4);
        ImageView imageView4 = view.findViewById(R.id.CSSYtResourceimage5);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=Edsxf_NBFrw&t=3s");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL4PaOIHsZcwJ5WLSMeOCrlmrLdphfhcpo");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLhzIaPMgkbxBk9-drEC0MBPqEOXpVlwY4");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLjpp5kBQLNTSFXXi-bfskBXG178FGkftU");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLr6-GrHUlVf8JIgLcu3sHigvQjTw_aC9C");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}