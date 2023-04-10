package com.example.l_clan.bottomnavigation.BackendFrameworksFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.SpringFragment.SpringFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.SpringFragment.SpringFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendFrameworkSpringBottomNavigationBinding;

public class BackendFrameworkSpringBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendFrameworkSpringBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendFrameworkSpringBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new SpringFragmentWebsite());
        binding.BackendFrameworkSpringNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new SpringFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new SpringFragmentYoutube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendFrameworkSpringLayout, fragment)
                .commit();
    }
}