package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.l_clan.OtherActivities.MainActivity2;
import com.example.l_clan.R;



public class HTMLWebsite extends Fragment {

    public HTMLWebsite() {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_h_t_m_l_website, container, false);
        ImageView imageView = view.findViewById(R.id.webResourceimage1);
        ImageView imageView1 = view.findViewById(R.id.webResourceimage2);
        ImageView imageView2 = view.findViewById(R.id.webResourceimage3);
        ImageView imageView3 = view.findViewById(R.id.webResourceimage4);
        ImageView imageView4 = view.findViewById(R.id.webResourceimage5);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.w3schools.com/html/default.asp");
//                Intent intent = new Intent(getContext(), MainActivity2.class);
//                startActivity(intent);
            }


        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                gotoUrl("https://www.geeksforgeeks.org/html/");
            }

        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.javatpoint.com/html-tutorial");
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.freecodecamp.org/news/tag/html/");

            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/html/index.htm");
            }
        });

        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

//    private void gotoUrl(String s) {
//        Uri uri = Uri.parse(s);
//        startActivity(new Intent(Intent.ACTION_VIEW,uri));
//    }

//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }

    }