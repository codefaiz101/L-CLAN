package com.example.l_clan.Domains;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.DomainAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Domains.AndroidDevelopment.AppActivity;
import com.example.l_clan.Domains.WebDevelopment.WebActivity;
import com.example.l_clan.Models.DomainModels;
import com.example.l_clan.OtherActivities.MainActivity2;
import com.example.l_clan.R;

import java.util.ArrayList;

    public  class DomainsPartActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_domains_part);
            recyclerView = findViewById(R.id.recyclerview);

            ArrayList<DomainModels> list = new ArrayList<>();
//            list.add(new DomainModels("WEB APPLICATION DEVELOPMENT"),R.drawable.webdevelopment);
            list.add(new DomainModels("WEB DEVELOPMENT", R.drawable.webdevelopment));
            list.add(new DomainModels("MOBILE APPICATION DEVELOPMENT", R.drawable.appdevelopment));
            list.add(new DomainModels("CLOUD DEVELOPMENT", R.drawable.clouddevelopment));
            list.add(new DomainModels("CYBER SECURITY DEVELOPMENT", R.drawable.cybersecurity));
            list.add(new DomainModels("BLOCKCHAIN DEVELOPMENT", R.drawable.blockchiandevelopment));
            list.add(new DomainModels("ARTIFICIAL INTELLEGENCE DEVELOPMENT", R.drawable.aidevelopment));
            list.add(new DomainModels("DATABASE DEVELOPMENT", R.drawable.databasedevelopment));
            DomainAdapter adapter = new DomainAdapter(list , this);
            recyclerView.setAdapter(adapter);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);


            recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                    this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    switch (position){
                        case 0:
                            Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getApplicationContext(), AppActivity.class);
                            startActivity(intent1);
                            break;

                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(), MainActivity2.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(getApplicationContext(),MainActivity2.class);
                            startActivity(intent7);
                            break;
                        default:
                            Intent intent8 = new Intent(getApplicationContext(), DomainsPartActivity.class);
                    }
                }

                @Override
                public void onLongItemClick(View view, int position) {

                }
            }
            ));


        }
    }

