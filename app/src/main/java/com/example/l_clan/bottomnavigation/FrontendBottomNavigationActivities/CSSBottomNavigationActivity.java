package com.example.l_clan.bottomnavigation.FrontendBottomNavigationActivities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.CSSFragment.CSSWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.CSSFragment.CSSYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityCssbottomNavigation2Binding;

public class CSSBottomNavigationActivity extends AppCompatActivity {
    ActivityCssbottomNavigation2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCssbottomNavigation2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new CSSWebsite());
        binding.cssbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new CSSWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new CSSYoutube());
                    break;
            }
            return  true;
        });
    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.cssframeLayout, fragment)
                .commit();
    }
}