package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Reinforcement_Learning;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;


public class Rl_OpenAi_Fragment_Website extends Fragment {


    public Rl_OpenAi_Fragment_Website() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rl__open_ai___website, container, false);
        ImageView imageView1 = view.findViewById(R.id.RL_OpenAI_ResourceImage1);
        ImageView imageView2 = view.findViewById(R.id.RL_OpenAI_ResourceImage2);
        ImageView imageView3 = view.findViewById(R.id.RL_OpenAI_ResourceImage3);
        ImageView imageView4 = view.findViewById(R.id.RL_OpenAI_ResourceImage4);
        ImageView imageView5 = view.findViewById(R.id.RL_OpenAI_ResourceImage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.gymlibrary.dev/content/tutorials/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://github.com/openai/gym");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.learndatasci.com/tutorials/reinforcement-q-learning-scratch-python-openai-gym/");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.section.io/engineering-education/building-a-reinforcement-learning-environment-using-openai-gym/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.gocoder.one/blog/rl-tutorial-with-openai-gym/");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}