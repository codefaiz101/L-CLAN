package com.example.l_clan.bottomnavigation.BackendDevelopmentToolsFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.KubernatesFragment.KubernateFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DeploymentToolsFragmentpart.KubernatesFragment.KubernateFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendDevelopmentToolsKubernatesBottomNavigationBinding;

public class BackendDevelopmentToolsKubernatesBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendDevelopmentToolsKubernatesBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendDevelopmentToolsKubernatesBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new KubernateFragmentWebsite());
        binding.BackendDevelopmentToolsKubernatesNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new KubernateFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new KubernateFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendDevelopmentToolsKubernatesLayout, fragment)
                .commit();
    }
}