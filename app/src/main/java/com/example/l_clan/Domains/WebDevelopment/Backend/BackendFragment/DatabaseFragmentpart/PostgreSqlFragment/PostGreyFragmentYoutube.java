package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.PostgreSqlFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class PostGreyFragmentYoutube extends Fragment {


    public PostGreyFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post_grey_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.PostGreyYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.PostGreyYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.PostGreyYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.PostGreyYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/qw--VYLpxG4");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLk1kxccoEnNEtwGZW-3KAcAlhI_Guwh8x");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLwvrYc43l1MxAEOI_KwGe8l42uJxMoKeS");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/eMIxuk0nOkU");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}