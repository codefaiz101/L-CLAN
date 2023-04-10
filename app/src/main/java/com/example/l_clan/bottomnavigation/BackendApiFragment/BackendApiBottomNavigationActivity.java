package com.example.l_clan.bottomnavigation.BackendApiFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.ApiFragment.APIFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.ApiFragment.APIFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.JavaFragment.JavaFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.JavaFragment.JavaFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendApiBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendJavaBottomNavigationBinding;

public class BackendApiBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendApiBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendApiBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new APIFragmentWebsite());
        binding.BackendApisNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new APIFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new APIFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendApisLayout, fragment)
                .commit();
    }
}