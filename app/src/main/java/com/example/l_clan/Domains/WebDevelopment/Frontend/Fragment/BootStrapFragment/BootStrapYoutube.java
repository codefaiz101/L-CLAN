package com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.BootStrapFragment;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class BootStrapYoutube extends Fragment {


    public BootStrapYoutube() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_boot_strap_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.BsYtResource1);
        ImageView imageView2 = view.findViewById(R.id.BsYtResource2);
        ImageView imageView3 = view.findViewById(R.id.BsYtResource3);
        ImageView imageView4 = view.findViewById(R.id.BsYtResource4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=aVgLHPxX5Y8&list=PLdBwVRHjcI__bKtzq0O7dYZ9yPKpi9uSh");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=nahewStckVU");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=bn60njFDwf4");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLdPwRNmUlk0ka9Woqt3Xz4YKr5Fy5wjQT");
            }
        });
        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}