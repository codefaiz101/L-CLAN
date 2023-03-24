package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
    TextView textView, textView1, textView2,textView3,textView4;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_h_t_m_l_website, container, false);
        textView = view.findViewById(R.id.WebResource1);
        textView1 = view.findViewById(R.id.WebResource2);
        textView2 = view.findViewById(R.id.WebResource3);
        textView3 = view.findViewById(R.id.WebResource4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.w3schools.com/html/default.asp");
//                Intent intent = new Intent(getContext(), MainActivity2.class);
//                startActivity(intent);
            }


        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.javatpoint.com/html-tutorial");
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.freecodecamp.org/news/tag/html/");
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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