package com.example.l_clan.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.AngularFragment.AngularWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.AngularFragment.AngularYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityAndroidDevelopmentBinding;
import com.example.l_clan.databinding.ActivityAngularjsBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBooststrapBottonNavigationBinding;

public class BooststrapBottonNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booststrap_botton_navigation);
        ActivityBooststrapBottonNavigationBinding binding = ActivityBooststrapBottonNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new AngularWebsite());
        binding.BsbottomNavigationView.setOnItemSelectedListener(item -> {

            /*This is default code */
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new AngularWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new AngularYoutube());
                    break;
            }
            return  true;

        });
    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BsbottomNavigationView, fragment)
                .commit();
    }
}