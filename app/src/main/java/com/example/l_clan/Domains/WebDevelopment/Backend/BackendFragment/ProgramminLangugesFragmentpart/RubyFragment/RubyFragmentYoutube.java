package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.RubyFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class RubyFragmentYoutube extends Fragment {

    public RubyFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ruby_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.RubyYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.RubyYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.RubyYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.RubyYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLlxmoA0rQ-Lx45j3D6da7-Iqvo5wtjKBm");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLgPJX9sVy92yefe1xmyxgcyXjxmLHsSEV");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLlxmoA0rQ-Lx45j3D6da7-Iqvo5wtjKBm");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLLAZ4kZ9dFpO90iMas70Tt4_wYjhLGkya");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}