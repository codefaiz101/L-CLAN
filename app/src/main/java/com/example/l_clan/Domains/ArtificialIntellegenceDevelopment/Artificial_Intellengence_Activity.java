package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_Learning_Activity;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Deep_Learning.Deep_Learning_Activity;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.Machine_Learning_Activity;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Natural_Laguage_Processing.Natural_Language_Processing_Activity;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.Neural_Network_Activity;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Reinforcement_Learning.Reinforcement_Learning_Activity;


import com.example.l_clan.R;

public class Artificial_Intellengence_Activity extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificial_intellengence);


        TextView myTextView = findViewById(R.id.RoadmapwebTextView);

        // Set the hyperlink URL for the TextView
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.example.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        imageView1 = findViewById(R.id.AIStep1Image);
        imageView2 = findViewById(R.id.Step2_ML_Image);
        imageView3 = findViewById(R.id.Step3_NN_Image);
        imageView4 = findViewById(R.id.Step4_NLP_Image);
        imageView5 = findViewById(R.id.Step5_DL_Image);
        imageView6 = findViewById(R.id.Step6_RL_Image);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AI_Learning_Activity.class);
                Toast.makeText(Artificial_Intellengence_Activity.this, "Let Explore Programming Languages", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Machine_Learning_Activity.class);
                Toast.makeText(Artificial_Intellengence_Activity.this, "Let Explore Machine Learning", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Neural_Network_Activity.class);
                Toast.makeText(Artificial_Intellengence_Activity.this, "Let Explore Neural Network", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Natural_Language_Processing_Activity.class);
                Toast.makeText(Artificial_Intellengence_Activity.this, "Let Explore Natural Language Processing", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Deep_Learning_Activity.class);
                Toast.makeText(Artificial_Intellengence_Activity.this, "Let Explore Deep Learning", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Reinforcement_Learning_Activity.class);
                Toast.makeText(Artificial_Intellengence_Activity.this, "Let Explore Reinforcement Learning", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
