package com.example.l_clan.bottomnavigation.BackendVersionControlSystemFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.ApiFragment.APIFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.ApiFragment.APIFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.MongoDbFragment.MongodbFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDatabaseMongoDbBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendVersionControlSystemApisBottomNavigationBinding;

public class BackendVersionControlSystemApisBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendVersionControlSystemApisBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendVersionControlSystemApisBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new APIFragmentWebsite());
        binding.BackendVersionControlSystemApisNavigationView.setOnItemSelectedListener(item -> {
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
                .replace(R.id.BackendVersionControlSystemApisLayout, fragment)
                .commit();
    }
}