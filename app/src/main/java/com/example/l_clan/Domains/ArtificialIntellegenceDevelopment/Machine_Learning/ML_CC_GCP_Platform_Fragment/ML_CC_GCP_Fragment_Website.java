package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_CC_GCP_Platform_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class ML_CC_GCP_Fragment_Website extends Fragment {


    public ML_CC_GCP_Fragment_Website() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_m_l__c_c__g_c_p___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_CC_GCP_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.ML_CC_GCP_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.ML_CC_GCP_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.ML_CC_GCP_ResourceImage4);
        ImageView imageView5 = view.findViewById(R.id.ML_CC_GCP_ResourceImage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://cloud.google.com/docs/open-tutorials");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/google-cloud-platform-tutorial/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/google-cloud-platform-from-zero-to-hero/");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.edureka.co/blog/google-cloud-platform-tutorial/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.educba.com/google-cloud-platform/");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}