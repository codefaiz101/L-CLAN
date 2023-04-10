package com.example.l_clan.bottomnavigation.BackendFrameworksFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment.DjangoFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment.DjangoFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendFrameworkDjangoBottomNavigationBinding;


public class BackendFrameworkDjangoBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendFrameworkDjangoBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendFrameworkDjangoBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new DjangoFragmentWebsite());
        binding.BackendFrameworkDjangoNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new DjangoFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new DjangoFragmentYoutube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendFrameworkDjangoLayout, fragment)
                .commit();
    }
}