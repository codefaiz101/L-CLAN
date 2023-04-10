package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.KubernatesFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class KubernateFragmentWebsite extends Fragment {


    public KubernateFragmentWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kubernate_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendKubernatesResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendKubernatesResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendKubernatesResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendKubernatesResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendKubernatesResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.geeksforgeeks.org/kubernetes-tutorial/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/kubernetes");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://kubernetes.io/docs/tutorials/");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tutorialspoint.com/kubernetes/index.htm");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/kubernetes/");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}