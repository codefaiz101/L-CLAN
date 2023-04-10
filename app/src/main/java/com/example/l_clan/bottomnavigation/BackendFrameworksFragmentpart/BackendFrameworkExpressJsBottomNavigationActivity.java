package com.example.l_clan.bottomnavigation.BackendFrameworksFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.ExpressJsFragment.ExpressFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.ExpressJsFragment.ExpressFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendFrameworkDjangoBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendFrameworkExpressJsBottomNavigationBinding;

public class BackendFrameworkExpressJsBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendFrameworkExpressJsBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendFrameworkExpressJsBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new ExpressFragmentWebsite());
        binding.BackendFrameworkExpressJsNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new ExpressFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new ExpressFragmentYoutube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendFrameworkExpressJsLayout, fragment)
                .commit();
    }
}