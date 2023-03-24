package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.l_clan.R;

import org.w3c.dom.Text;


public class HTMLYoutube extends Fragment {



    public HTMLYoutube() {
        // Required empty public constructor
    }
    TextView textView1,textView2,textView3,textView4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_h_t_m_l_youtube, container, false);
        textView1 = view.findViewById(R.id.YtResource1);
        textView2= view.findViewById(R.id.YtResource2);
        textView3 = view.findViewById(R.id.YtResource3);
        textView4 = view.findViewById(R.id.YtResource4);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                gotoUrl("")
            }
        });


        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}