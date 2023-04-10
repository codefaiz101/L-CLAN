package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.JenkinsFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class JenkinsFragmentYoutube extends Fragment {


    public JenkinsFragmentYoutube() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jenkins_youtube, container, false);
        ImageView imageView1 = view.findViewById(R.id.JenkinsYtResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.JenkinsYtResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.JenkinsYtResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.JenkinsYtResourceimage4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLhW3qG5bs-L_ZCOA4zNPSoGbnVQ-rp_dG");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtu.be/FX322RVNGj4");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PL6XT0grm_Tfi21F8O0TvHmb78P2uEmhDq");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/playlist?list=PLS1QulWo1RIbY8xXPqz6ad_sNHkIP3IXI");
            }
        });



        return view;
    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}