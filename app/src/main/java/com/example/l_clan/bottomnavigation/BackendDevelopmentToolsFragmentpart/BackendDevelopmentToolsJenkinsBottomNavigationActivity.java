package com.example.l_clan.bottomnavigation.BackendDevelopmentToolsFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.JenkinsFragment.JenkinsFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.JenkinsFragment.JenkinsFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendDevelopmentToolsJenkinsBottomNavigationBinding;

public class BackendDevelopmentToolsJenkinsBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendDevelopmentToolsJenkinsBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendDevelopmentToolsJenkinsBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new JenkinsFragmentWebsite());
        binding.BackendDevelopmentToolsJenkinsNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new JenkinsFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new JenkinsFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendDevelopmentToolsJenkinsLayout, fragment)
                .commit();
    }
}