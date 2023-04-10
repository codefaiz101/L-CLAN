package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class DjangoFragmentWebsite extends Fragment {

    public DjangoFragmentWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_django_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendDjangoResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendDjangoResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendDjangoResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendDjangoResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendDjangoResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.com/django/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/django-tutorial/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/django-tutorial");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://developer.mozilla.org/en-US/docs/Learn/Server-side/Django");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/django/index.htm");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}