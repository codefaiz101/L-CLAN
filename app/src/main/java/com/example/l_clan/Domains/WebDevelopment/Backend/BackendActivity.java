package com.example.l_clan.Domains.WebDevelopment.Backend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.l_clan.Adapter.BackendAdapters.DBMSAdapter;
import com.example.l_clan.Adapter.BackendAdapters.DeploymentAdapter;
import com.example.l_clan.Adapter.BackendAdapters.FrameworksAdapter;
import com.example.l_clan.Adapter.BackendAdapters.ProgramminglanguageAdapter;
import com.example.l_clan.Adapter.BackendAdapters.ServerAdapter;
import com.example.l_clan.Adapter.BackendAdapters.TTAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Models.BackendModels.DBMSModel;
import com.example.l_clan.Models.BackendModels.DeploymentModel;
import com.example.l_clan.Models.BackendModels.FrameworksModels;
import com.example.l_clan.Models.BackendModels.ProgramminglanguageModels;
import com.example.l_clan.Models.BackendModels.ServerModels;
import com.example.l_clan.Models.BackendModels.TTModels;
import com.example.l_clan.R;
import com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendJavaBottomNavigationActivity;

import java.util.ArrayList;


public class BackendActivity extends AppCompatActivity {
  RecyclerView recyclerView;
  RecyclerView recyclerView1;
  RecyclerView recyclerView2;
  RecyclerView recyclerView4;
  RecyclerView recyclerView5;


  RecyclerView recyclerView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend);
        //This is all of Programming Languges
        recyclerView = findViewById(R.id.ProgrammingRecycler);
        ArrayList<ProgramminglanguageModels> list = new ArrayList<>();
        list.add(new ProgramminglanguageModels("Java",R.drawable.java1));
        list.add(new ProgramminglanguageModels("Python",R.drawable.python1));
        list.add(new ProgramminglanguageModels("PHP",R.drawable.php));
        list.add(new ProgramminglanguageModels("Ruby",R.drawable.ruby));
        list.add(new ProgramminglanguageModels("Nodejs",R.drawable.nodejs));
        ProgramminglanguageAdapter adapter = new ProgramminglanguageAdapter(list,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(BackendActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent4);
                        break;
                    default:
                        Intent intent5 = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent5);

                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));


        //This is for Frameworks
        recyclerView1 = findViewById(R.id.FrameworkRecycler);
        ArrayList<FrameworksModels> list1 = new ArrayList<>();
        list1.add(new FrameworksModels("Django",R.drawable.django));
        list1.add(new FrameworksModels("Ruby On Rails",R.drawable.rubyandrails));
        list1.add(new FrameworksModels("Laravel",R.drawable.laravel));
        list1.add(new FrameworksModels("Expres.Js",R.drawable.expressjs));
        list1.add(new FrameworksModels("Spring",R.drawable.spring));
        FrameworksAdapter adapter1 = new FrameworksAdapter(list1,this);
        recyclerView1.setAdapter(adapter1);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(BackendActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager1);


        //This is for DBMS
        recyclerView2 = findViewById(R.id.DBMSRecycler);
        ArrayList<DBMSModel> list2 = new ArrayList<>();
        list2.add(new DBMSModel("MySql",R.drawable.mysql));
        list2.add(new DBMSModel("PostgreSQL",R.drawable.postgres));
        list2.add(new DBMSModel("MongoDB",R.drawable.mongodb));
        list2.add(new DBMSModel("Oracle",R.drawable.oracle));
        DBMSAdapter adapter2 = new DBMSAdapter(list2, this);
        recyclerView2.setAdapter(adapter2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(BackendActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);


        //This is for servers
        recyclerView3 = findViewById(R.id.ServerRecycler);
        ArrayList<ServerModels> list3 = new ArrayList<>();
        list3.add(new ServerModels("Apache",R.drawable.apacheserver));
        list3.add(new ServerModels("Nignx",R.drawable.nginx));
        list3.add(new ServerModels("Oracle",R.drawable.oracle));
        ServerAdapter adapter3 = new ServerAdapter(list3,this);
        recyclerView3.setAdapter(adapter3);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(BackendActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(layoutManager3);


        recyclerView4 = findViewById( R.id.TTRecycler);
        ArrayList<TTModels> list4 = new ArrayList<>();
        list4.add(new TTModels("JEST",R.drawable.jest));
        list4.add(new TTModels("Mocha",R.drawable.mocha));
        list4.add(new TTModels("Selenium",R.drawable.selenium));
        TTAdapter adapter4 = new TTAdapter(list4,this);
        recyclerView4.setAdapter(adapter4);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(BackendActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(layoutManager4);

        recyclerView5 = findViewById( R.id.DTRecycler);
        ArrayList<DeploymentModel> list5 = new ArrayList<>();
            list5.add(new DeploymentModel("KUBARANATES",R.drawable.kubernates_image));
        list5.add(new DeploymentModel("DOCKER",R.drawable.docker_image));
        list5.add(new DeploymentModel("JENKINS",R.drawable.jenkins_image));
        DeploymentAdapter adapter5 = new DeploymentAdapter(list5, this) ;
        recyclerView5.setAdapter(adapter5);
        LinearLayoutManager layoutManager5 = new LinearLayoutManager(BackendActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(layoutManager5);


    }
}