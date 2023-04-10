package com.example.l_clan.Domains;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.DomainAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Domains.AndroidDevelopment.Android_Development_Activity;
import com.example.l_clan.Domains.WebDevelopment.WebActivity;
import com.example.l_clan.Models.DomainModels;
import com.example.l_clan.OtherActivities.MainActivity2;
import com.example.l_clan.OtherActivities.coming_soon;
import com.example.l_clan.OtherActivities.userprofile;
import com.example.l_clan.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class DomainsPartActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
        RecyclerView recyclerView;
        DrawerLayout drawerLayout;
        NavigationView navigationView;
        Toolbar toolbar;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_domains_part);
            recyclerView = findViewById(R.id.recyclerview);
            navigationView = findViewById(R.id.navigation_view);
            toolbar = findViewById(R.id.toolbar);
            drawerLayout = findViewById(R.id.drawerlayout);

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
                            Intent intent1 = new Intent(getApplicationContext(), Android_Development_Activity.class);
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

// Manually add the Toolbar
            setSupportActionBar(toolbar);

//        navigationView.bringToFront();
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigattion_open, R.string.navigattion_close);
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();
            navigationView.setNavigationItemSelectedListener(this);
            navigationView.setCheckedItem(R.id.home_menu);
        }
        @Override
        public void onBackPressed() {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_menu:
                    break;
                case R.id.settings_menu:
                    Intent intent = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent);
                    break;
                case R.id.userprofile_menu:
                    Intent intent1 = new Intent(getApplicationContext(), userprofile.class);
//                intent1.putExtra("username2", currentuser.getDisplayName());
                    startActivity(intent1);
                    break;
                case R.id.history_menu:
                    Intent intent2 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent2);
                    break;
                case R.id.info_menu:
                    Intent intent3 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent3);
                    break;
                case R.id.WEB_DEVELOPMENT:
                    Intent intent4 = new Intent(getApplicationContext(), WebActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.ANDROID_DEVELOPMENT:
                    Intent intent5 = new Intent(getApplicationContext(), Android_Development_Activity.class);
                    startActivity(intent5);
                    break;
                case R.id.CLOUD_DEVELOPMENT:
                    Intent intent6 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent6);
                    break;
                case R.id.CYBER_SECURITY:
                    Intent intent7 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent7);
                    break;
                case R.id.BLOCKCHAIN_DEVELOPMENT:
                    Intent intent8 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent8);
                    break;
                case R.id.ARTIFICIAL_INTELLIGENCE:
                    Intent intent9 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent9);
                    break;
                case R.id.DATABASE_MANAGEMENT:
                    Intent intent10 = new Intent(getApplicationContext(), coming_soon.class);
                    startActivity(intent10);
                    break;

            }

            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
    }

