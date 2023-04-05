package com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.JavaFragment.JavaFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.JavaFragment.JavaFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendJavaBottomNavigationBinding;

public class BackendJavaBottomNavigationActivity extends AppCompatActivity {
   ActivityBackendJavaBottomNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendJavaBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new JavaFragmentWebsite());
        binding.JavabottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new JavaFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new JavaFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.JavabottomNavigationView, fragment)
                .commit();
    }
}