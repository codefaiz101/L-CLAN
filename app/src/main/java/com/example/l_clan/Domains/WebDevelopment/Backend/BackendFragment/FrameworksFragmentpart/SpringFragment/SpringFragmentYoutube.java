package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.SpringFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class SpringFragmentYoutube extends Fragment {

    public SpringFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_spring_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.SpringYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.SpringYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.SpringYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.SpringYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLC97BDEFDCDD169D7");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL0zysOflRCekeiERASkpi-crREVensZGS");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLw_k9CF7hBpJJsRWAhwSrDlWAzuMV0irl");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}