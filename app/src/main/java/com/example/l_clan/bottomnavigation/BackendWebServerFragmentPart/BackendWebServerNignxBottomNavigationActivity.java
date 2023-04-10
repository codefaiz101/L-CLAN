package com.example.l_clan.bottomnavigation.BackendWebServerFragmentPart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.WebServersFragementpart.NignxFragment.NignxFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.WebServersFragementpart.NignxFragment.NignxFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendWebServerNignxBottomNavigationBinding;

public class BackendWebServerNignxBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendWebServerNignxBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendWebServerNignxBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new NignxFragmentWebsite());
        binding.BackendWebServerNignxNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new NignxFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new NignxFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendWebServerNignxLayout, fragment)
                .commit();
    }
}