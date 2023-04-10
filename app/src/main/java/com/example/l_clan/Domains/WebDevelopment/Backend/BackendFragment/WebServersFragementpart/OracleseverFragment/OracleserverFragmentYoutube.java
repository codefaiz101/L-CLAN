package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.WebServersFragementpart.OracleseverFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class OracleserverFragmentYoutube extends Fragment {


    public OracleserverFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_oracleserver_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.OracleServerYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.OracleServerYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.OracleServerYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.OracleServerYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLB5DA82419C2D99B6");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLd3UqWTnYXOnQ5a990TUv7FJVzB2M7h2O");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/ObbNGhcxXJA");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLiLpmqwkwkCt0QeXD8j7BwIoOaBGBRrZC");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}