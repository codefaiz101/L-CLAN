package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MySqlFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class MySqlFragmentYoutube extends Fragment {


    public MySqlFragmentYoutube() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_sql_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.MySqlYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.MySqlYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.MySqlYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.MySqlYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/7S_tz1z_5bA");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/HXV3zeQKqGY");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL0b6OzIxLPbzf12lu5etX_vjN-eUxgxnr");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL32BC9C878BA72085");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}