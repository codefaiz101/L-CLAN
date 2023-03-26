package com.example.l_clan.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet.HTMLWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet.HTMLYoutube;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.ReactJsFragment.ReactJsWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.ReactJsFragment.ReactJsYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityReactjsBottomNavigationBinding;

public class ReactjsBottomNavigationActivity extends AppCompatActivity {
       ActivityReactjsBottomNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReactjsBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new ReactJsWebsite());
        binding.RjsbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new ReactJsWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new ReactJsYoutube());
                    break;
//
            }
            return true;
        });
    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.RjsframeLayout, fragment)
                .commit();
    }
}