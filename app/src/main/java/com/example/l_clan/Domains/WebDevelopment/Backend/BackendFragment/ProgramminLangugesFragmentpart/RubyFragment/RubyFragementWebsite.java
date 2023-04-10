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

public class RubyFragementWebsite extends Fragment {

    public RubyFragementWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ruby_fragement_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendRubyResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendRubyResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendRubyResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendRubyResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendRubyResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/ruby-tutorial/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/ruby-tutorial");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/ruby/index.htm");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/learning-ruby-from-zero-to-hero-90ad4eecc82d/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ruby-lang.org/en/documentation/quickstart/");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}