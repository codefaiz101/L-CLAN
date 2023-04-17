package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_CC_AWS_Platform_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class ML_CC_AWS_Fragment_Website extends Fragment {



    public ML_CC_AWS_Fragment_Website() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_m_l__c_c__a_w_s___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_CC_AWS_Resourceimage1);
        ImageView imageView2 = view.findViewById(R.id.ML_CC_AWS_Resourceimage2);
        ImageView imageView3 = view.findViewById(R.id.ML_CC_AWS_Resourceimage3);
        ImageView imageView4 = view.findViewById(R.id.ML_CC_AWS_Resourceimage4);
        ImageView imageView5 = view.findViewById(R.id.ML_CC_AWS_Resourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.com/aws/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/aws-tutorial/");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/aws-tutorial");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://aws.amazon.com/getting-started/hands-on/?getting-started-all.sort-by=item.additionalFields.content-latest-publish-date&getting-started-all.sort-order=desc&awsf.getting-started-category=*all&awsf.getting-started-content-type=*all");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/amazon_web_services/index.htm");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}