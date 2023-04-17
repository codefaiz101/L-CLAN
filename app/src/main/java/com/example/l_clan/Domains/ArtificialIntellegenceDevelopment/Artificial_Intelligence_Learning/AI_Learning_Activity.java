package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.ai_basic_learning_adapter.ai_basic_Learning_adapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Models.Artificial_Intelligence_Development.AI_Basic_learning_Model.ai_basic_learning_Model;
import com.example.l_clan.R;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_C_Plus_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_Java_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_Python_BottomNavigation_Activity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_R_Programming_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages.BackendPythonBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.BottomNavigationActivity;

import java.util.ArrayList;

public class AI_Learning_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_learning);

        imageView1 = findViewById(R.id.AI_Python_Image);
        imageView2 = findViewById(R.id.AI_R_Image);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BackendPythonBottomNavigationActivity.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AI_R_Programming_BottomNavigationActivity.class);
                startActivity(intent);
            }
        });



        recyclerView = findViewById(R.id.AI_java_cplus_Recycler);
        ArrayList<ai_basic_learning_Model> list = new ArrayList<>();
        list.add(new ai_basic_learning_Model("Java",R.drawable.javaimage));
        list.add(new ai_basic_learning_Model("C++",R.drawable.c_plus_language));

        ai_basic_Learning_adapter adapter = new ai_basic_Learning_adapter(list,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(AI_Learning_Activity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), BackendPythonBottomNavigationActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), AI_C_Plus_BottomNavigationActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent4);
                        break;
                    default:
                        Intent intent6 = new Intent(getApplicationContext(), AI_Java_BottomNavigationActivity.class);
                        startActivity(intent6);

                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}

