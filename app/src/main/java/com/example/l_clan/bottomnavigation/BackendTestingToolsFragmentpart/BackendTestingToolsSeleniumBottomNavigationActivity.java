package com.example.l_clan.bottomnavigation.BackendTestingToolsFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.TestingtoolsFragmentpart.SeleninumFragment.SeleninumFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.TestingtoolsFragmentpart.SeleninumFragment.SeleninumFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendTestingToolsSeleniumBottomNavigationBinding;

public class BackendTestingToolsSeleniumBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendTestingToolsSeleniumBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendTestingToolsSeleniumBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new SeleninumFragmentWebsite());
        binding.BackendTestingToolsSeleniumNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new SeleninumFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new SeleninumFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendTestingToolsSeleniumLayout, fragment)
                .commit();
    }
}