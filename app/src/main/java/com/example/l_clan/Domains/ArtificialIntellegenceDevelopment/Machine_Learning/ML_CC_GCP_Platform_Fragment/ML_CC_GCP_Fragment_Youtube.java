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

public class ML_CC_GCP_Fragment_Youtube extends Fragment {

    public ML_CC_GCP_Fragment_Youtube() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_m_l__c_c__g_c_p___youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.ML_CC_GCP_YT_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.ML_CC_GCP_YT_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.ML_CC_GCP_YT_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.ML_CC_GCP_YT_ResourceImage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/jpno8FSqpc8");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/EN4fEbcFZ_E");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLBGx66SQNZ8YWRUw6yicKtD4AIpUl_YiJ");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLIivdWyY5sqKh1gDR0WpP9iIOY00IE0xL");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}