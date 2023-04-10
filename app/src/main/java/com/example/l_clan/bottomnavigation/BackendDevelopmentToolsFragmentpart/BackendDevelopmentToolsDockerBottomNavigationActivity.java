package com.example.l_clan.bottomnavigation.BackendDevelopmentToolsFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.DockerFragment.DockerFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.DockerFragment.DockerFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendDevelopmentToolsDockerBottomNavigationBinding;

public class BackendDevelopmentToolsDockerBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendDevelopmentToolsDockerBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendDevelopmentToolsDockerBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new DockerFragmentWebsite());
        binding.BackendDevelopmentToolsDockerlNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new DockerFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new DockerFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendDevelopmentToolsDockerlLayout, fragment)
                .commit();
    }
}