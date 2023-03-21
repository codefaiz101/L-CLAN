package com.example.l_clan.OtherActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.l_clan.R;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class first_page extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);

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

    @Override
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
            case R.id.websites_menu:
                Intent intent4 = new Intent(getApplicationContext(), coming_soon.class);
                startActivity(intent4);
                break;
            case R.id.youtube_menu:
                Intent intent5 = new Intent(getApplicationContext(), coming_soon.class);
                startActivity(intent5);
                break;
            case R.id.documentation_menu:
                Intent intent6 = new Intent(getApplicationContext(), coming_soon.class);
                startActivity(intent6);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
