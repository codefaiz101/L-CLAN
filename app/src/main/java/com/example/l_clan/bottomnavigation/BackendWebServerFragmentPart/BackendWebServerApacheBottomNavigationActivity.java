package com.example.l_clan.bottomnavigation.BackendWebServerFragmentPart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.WebServersFragementpart.ApacheFragment.ApacheFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.WebServersFragementpart.ApacheFragment.ApacheFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendWebServerApacheBottomNavigationBinding;

public class BackendWebServerApacheBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendWebServerApacheBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendWebServerApacheBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new ApacheFragmentWebsite());
        binding.BackendWebServerApacheNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new ApacheFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new ApacheFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendWebServerApacheLayout, fragment)
                .commit();
    }
}