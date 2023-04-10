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


public class RubyRailsFragmentWebsite extends Fragment {

    public RubyRailsFragmentWebsite() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ruby_rails_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendRubyOnRailsResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendRubyOnRailsResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendRubyOnRailsResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendRubyOnRailsResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendRubyOnRailsResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/ruby-on-rails-introduction/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/ruby-on-rails-tutorial");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.codecademy.com/resources/blog/what-is-ruby-on-rails/");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/ruby-on-rails/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/ruby-on-rails/index.htm");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}