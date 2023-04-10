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

public class ApacheFragmentYoutube extends Fragment {
    public ApacheFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_apache_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.ApacheYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.ApacheYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.ApacheYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.ApacheYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLkz1SCf5iB4enAR00Z46JwY9GGkaS2NON");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLtGnc4I6s8dsNLpl0G30Azcc-Q4eoM4TX");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLXZNtFtjYrnlT8tYqdmUsWa-WJIAuQ4xY");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/live/-d1Xz6Y3dj4?feature=share");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}