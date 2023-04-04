package com.example.l_clan.Domains.AndroidDevelopment.Java;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.Android_Development_Adapter.JavaResourceAdapter;
import com.example.l_clan.Adapter.BackendAdapters.ProgramminglanguageAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Domains.AndroidDevelopment.AppActivity;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendActivity;
import com.example.l_clan.Models.Android_Development.JavaResourcesModel;
import com.example.l_clan.Models.FrontendModels;
import com.example.l_clan.R;
import com.example.l_clan.bottomnavigation.BottomNavigationActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JavaActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2;
//    ImageView imageView1,imageView2,imageView3,imageView4,imageView5;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);



        recyclerView1 = findViewById(R.id.JavaResourceRV);
        ArrayList<JavaResourcesModel> list = new ArrayList<>();
        list.add(new JavaResourcesModel("Rank1", R.drawable.ytandroid));
        list.add(new JavaResourcesModel("Rank2", R.drawable.ytandroid));
        list.add(new JavaResourcesModel("Rank3", R.drawable.ytandroid));
        list.add(new JavaResourcesModel("Rank4", R.drawable.ytandroid));
        list.add(new JavaResourcesModel("Rank5", R.drawable.ytandroid));

        JavaResourceAdapter adapter= new JavaResourceAdapter(list,this);;
        recyclerView1.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(JavaActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager);

        recyclerView1.addOnItemTouchListener(new RecyclerItemClickListener(this,recyclerView1, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                      gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 1:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 2:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 3:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 4:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

        recyclerView2 = findViewById(R.id.androidjavawebresources);
        ArrayList<JavaResourcesModel> list1 = new ArrayList<>();
        list1.add(new JavaResourcesModel("Rank1", R.drawable.wthreeschool));
        list1.add(new JavaResourcesModel("Rank2", R.drawable.javatpont));
        list1.add(new JavaResourcesModel("Rank3", R.drawable.gfgimage));
        list1.add(new JavaResourcesModel("Rank4", R.drawable.freecodecamp));
        list1.add(new JavaResourcesModel("Rank5", R.drawable.freecodecamp));

        adapter = new JavaResourceAdapter(list1, this);
        ;
        recyclerView2.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(JavaActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager);

        recyclerView2.addOnItemTouchListener(new RecyclerItemClickListener(this,recyclerView2, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 1:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 2:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 3:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                    case 4:
                        gotoUrl("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q");
                        break;
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));


    }
    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
