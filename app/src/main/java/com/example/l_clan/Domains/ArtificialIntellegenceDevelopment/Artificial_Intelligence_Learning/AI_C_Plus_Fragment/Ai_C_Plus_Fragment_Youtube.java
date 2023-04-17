package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_C_Plus_Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class Ai_C_Plus_Fragment_Youtube extends Fragment {

    public Ai_C_Plus_Fragment_Youtube() {
        // Required empty public constructor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ai__c__plus___youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.Ai_c_plus_YT_Resourceimage1);
        ImageView imageView2 = view.findViewById(R.id.Ai_c_plus_YT_Resourceimage2);
        ImageView imageView3 = view.findViewById(R.id.Ai_c_plus_YT_Resourceimage3);
        ImageView imageView4 = view.findViewById(R.id.Ai_c_plus_YT_Resourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLlrATfBNZ98dudnM48yfGUldqGD0S4FFb");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}