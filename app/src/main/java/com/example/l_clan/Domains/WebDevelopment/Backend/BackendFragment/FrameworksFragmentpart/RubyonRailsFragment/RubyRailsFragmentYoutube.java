package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.RubyonRailsFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class RubyRailsFragmentYoutube extends Fragment {


    public RubyRailsFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ruby_rails_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.rubyOnRailsYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.rubyOnRailsYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.rubyOnRailsYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.rubyOnRailsYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL6SEI86zExmsdxwsyEQcFpF9DWmvttPPu");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLgPJX9sVy92yV7Qt6_8ElC9paGWdtdIbb");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLm8ctt9NhMNV75T9WYIrA6m9I_uw7vS56");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=fmyvWz5TUWg");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}