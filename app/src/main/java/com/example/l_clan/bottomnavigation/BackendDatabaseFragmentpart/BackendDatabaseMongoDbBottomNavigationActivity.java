package com.example.l_clan.bottomnavigation.BackendDatabaseFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.ApiFragment.APIFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.ApiFragment.APIFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendApiBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;

public class BackendDatabaseMongoDbBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendDatabaseMongoDbBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendDatabaseMongoDbBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new MongodbFragmentWebsite());
        binding.BackendDatabaseMongoDbNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new MongodbFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new MongodbFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendDatabaseMongoDbLayout, fragment)
                .commit();
    }
}