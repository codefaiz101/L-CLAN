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
    TextView imageView1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_h_t_m_l_website, container, false);
        imageView1 = view.findViewById(R.id.WebResource1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.w3schools.com/html/default.asp");
//                Intent intent = new Intent(getContext(), MainActivity2.class);
//                startActivity(intent);
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }

        });

        return view;
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