package com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter.ML_CC_Platforms_Adapter;
import com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter.ML_Libraries_Adapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_CC_Platform_Model;
import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_Libraries_Model;
import com.example.l_clan.R;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity.Ml_ScikitLearn_BottonNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity.Ml_TensorFlow_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity.NN_Pytorch_BottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.Ml_CC_Platforms_BottomNavigationActivity.MlGCPBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.Ml_CC_Platforms_BottomNavigationActivity.MlawsBottomNavigationActivity;
import com.example.l_clan.bottomnavigation.BottomNavigationActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Neural_Network_Activity extends AppCompatActivity {

    RecyclerView recyclerView2;
    RecyclerView recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neural_network);

        recyclerView2 = findViewById(R.id.NN_Cloud_Platform_Recycler);
        ArrayList<ML_CC_Platform_Model> list2 = new ArrayList<>();
        list2.add(new ML_CC_Platform_Model("Amazon Web Services", R.drawable.aws));
        list2.add(new ML_CC_Platform_Model("Google Cloud Platform", R.drawable.google_cloud));

        ML_CC_Platforms_Adapter adapter2 = new ML_CC_Platforms_Adapter(list2, this);
        recyclerView2.setAdapter(adapter2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(Neural_Network_Activity.this, LinearLayoutManager.HORIZONTAL, false);
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

        recyclerView1 = findViewById(R.id.NN_Libraries_Recycler);
        ArrayList<ML_Libraries_Model> list1 = new ArrayList<>();
        list1.add(new ML_Libraries_Model("Scikit Learn", R.drawable.scikitlearn));
        list1.add(new ML_Libraries_Model("TensorFlow", R.drawable.tensorflow));
        list1.add(new ML_Libraries_Model("PyTorch", R.drawable.pytorch));

        ML_Libraries_Adapter adapter1 = new ML_Libraries_Adapter(list1, this);
        recyclerView1.setAdapter(adapter1);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(Neural_Network_Activity.this, LinearLayoutManager.HORIZONTAL, false);
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
                        Intent intent2 = new Intent(getApplicationContext(), NN_Pytorch_BottomNavigationActivity.class);
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