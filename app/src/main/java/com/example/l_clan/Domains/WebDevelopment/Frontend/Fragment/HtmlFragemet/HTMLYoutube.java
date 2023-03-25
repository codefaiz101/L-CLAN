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

import com.example.l_clan.R;

import org.w3c.dom.Text;


public class HTMLYoutube extends Fragment {



    public HTMLYoutube() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_h_t_m_l_youtube, container, false);
        ImageView imageView = view.findViewById(R.id.YtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.YtResourceimage3);
        ImageView imageView1 = view.findViewById(R.id.YtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.YtResourceimage4);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=BsDoLVMnmZs");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=HcOc7P5BMi4");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLhzIaPMgkbxDsPU7jxB_XF_UoToJjpwxM");
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLjpp5kBQLNTSQqbELPhas4fOEHvO8nO5M");
            }
        });

        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}