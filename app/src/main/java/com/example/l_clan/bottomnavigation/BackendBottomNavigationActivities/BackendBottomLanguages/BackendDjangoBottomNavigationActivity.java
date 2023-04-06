package com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment.DjangoFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment.DjangoFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.JavaFragment.JavaFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.JavaFragment.JavaFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDjangoBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendJavaBottomNavigationBinding;

public class BackendDjangoBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendDjangoBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend_django_bottom_navigation);
        binding = ActivityBackendDjangoBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new DjangoFragmentWebsite());
        binding.DjangobottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new DjangoFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new DjangoFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.DjangoframeLayout, fragment)
                .commit();
    }

    }