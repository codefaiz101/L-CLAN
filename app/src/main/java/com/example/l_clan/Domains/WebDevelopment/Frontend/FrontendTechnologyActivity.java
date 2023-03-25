package com.example.l_clan.Domains.WebDevelopment.Frontend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.FrontendAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Models.FrontendModels;
import com.example.l_clan.R;
import com.example.l_clan.bottomnavigation.BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.CSSBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.JavaScriptBottomNavgationActivity;

import java.util.ArrayList;


public class FrontendTechnologyActivity extends AppCompatActivity {
  RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend_technology);
        recyclerView = findViewById(R.id.FrontendView);

        ArrayList<FrontendModels> list = new ArrayList<>();
        list.add(new FrontendModels(R.drawable.htmll,"HTML"));
        list.add(new FrontendModels(R.drawable.css,"CSS"));
        list.add(new FrontendModels(R.drawable.javascript1,"JavaScript"));
        list.add(new FrontendModels(R.drawable.reactjs1,"React.JS"));
        list.add(new FrontendModels(R.drawable.angular,"Angular"));
        list.add(new FrontendModels(R.drawable.tailwindcss,"Tailwind CSS"));
        list.add(new FrontendModels(R.drawable.bootstrap,"BootStrap"));


        FrontendAdapter adapter = new FrontendAdapter(list,this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), CSSBottomNavigationActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), JavaScriptBottomNavgationActivity.class);
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
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent6);
                        break;
                    default:
                        Intent intent7 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent7);
                }
            }
            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}