package com.example.l_clan.bottomnavigation.BackendTestingToolsFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.TestingtoolsFragmentpart.JestFragment.JestFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.TestingtoolsFragmentpart.JestFragment.JestFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendTestingToolsJestBottomNavigationBinding;

public class BackendTestingToolsJestBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendTestingToolsJestBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendTestingToolsJestBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new JestFragmentWebsite());
        binding.BackendTestingToolsJestNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new JestFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new JestFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendTestingToolsJestLayout, fragment)
                .commit();
    }
}