package com.example.l_clan.bottomnavigation.BackendFrameworksFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.LaravelFragment.LaravelFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.LaravelFragment.LaravelFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendFrameworkLaravelBottomNavigationBinding;

public class BackendFrameworkLaravelBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendFrameworkLaravelBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendFrameworkLaravelBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new LaravelFragmentWebsite());
        binding.BackendFrameworkLaravelNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new LaravelFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new LaravelFragmentYoutube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendFrameworkLaravelLayout, fragment)
                .commit();
    }
}