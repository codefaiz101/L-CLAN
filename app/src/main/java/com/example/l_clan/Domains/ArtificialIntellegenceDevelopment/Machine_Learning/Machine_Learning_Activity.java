package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter.ML_CC_Platforms_Adapter;
import com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter.ML_Libraries_Adapter;
import com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter.Ml_Languages_Adapter;

import com.example.l_clan.Classes.RecyclerItemClickListener;


import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_CC_Platform_Model;
import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_Languages_Model;
import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_Libraries_Model;
import com.example.l_clan.R;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_C_Plus_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_Python_BottomNavigation_Activity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.AI_R_Programming_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity.Ml_Keras_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity.Ml_ScikitLearn_BottonNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity.Ml_TensorFlow_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.Ml_CC_Platforms_BottomNavigationActivity.MlGCPBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.Ml_CC_Platforms_BottomNavigationActivity.MlawsBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages.BackendJavaBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages.BackendPythonBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.BottomNavigationActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Machine_Learning_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_learning);


        recyclerView = findViewById(R.id.Ml_Languages_Recycler);
        ArrayList<ML_Languages_Model> list = new ArrayList<>();
        list.add(new ML_Languages_Model("Python", R.drawable.python1));
        list.add(new ML_Languages_Model("R Programming", R.drawable.r_programming));
        list.add(new ML_Languages_Model("Java", R.drawable.javaimage));
        list.add(new ML_Languages_Model("C++", R.drawable.c_plus_language));

        Ml_Languages_Adapter adapter = new Ml_Languages_Adapter(list, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(Machine_Learning_Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), BackendPythonBottomNavigationActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), AI_R_Programming_BottomNavigationActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), BackendJavaBottomNavigationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), AI_C_Plus_BottomNavigationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent4);
                        break;
                    default:
                        Intent intent6 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent6);

                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));


          //libraries recycleView
        recyclerView1 = findViewById(R.id.Ml_Libraries_Recycler);
        ArrayList<ML_Libraries_Model> list1 = new ArrayList<>();
        list1.add(new ML_Libraries_Model("Scikit Learn", R.drawable.scikitlearn));
        list1.add(new ML_Libraries_Model("TensorFlow", R.drawable.tensorflow));
        list1.add(new ML_Libraries_Model("Keras", R.drawable.keras));

        ML_Libraries_Adapter adapter1 = new ML_Libraries_Adapter(list1, this);
        recyclerView1.setAdapter(adapter1);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(Machine_Learning_Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);

        recyclerView1.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView1, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), Ml_ScikitLearn_BottonNavigationActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), Ml_TensorFlow_BottomNavigationActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Ml_Keras_BottomNavigationActivity.class);
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
                        Intent intent6 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent6);

                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

        recyclerView2 = findViewById(R.id.ML_Cloud_Platform_Recycler);
        ArrayList<ML_CC_Platform_Model> list2 = new ArrayList<>();
        list2.add(new ML_CC_Platform_Model("Amazon Web Services", R.drawable.aws));
        list2.add(new ML_CC_Platform_Model("Google Cloud Platform", R.drawable.google_cloud));

        ML_CC_Platforms_Adapter adapter2 = new ML_CC_Platforms_Adapter(list2, this);
        recyclerView2.setAdapter(adapter2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(Machine_Learning_Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);

        recyclerView2.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView2, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), MlawsBottomNavigationActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), MlGCPBottomNavigationActivity.class);
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
                        Intent intent6 = new Intent(getApplicationContext(), BottomNavigationActivity.class);
                        startActivity(intent6);

                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}