package com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.NodejsFragment.NodeJsFragmentaWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.NodejsFragment.NodeJsFragmentaYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.RubyFragment.RubyFragementWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.RubyFragment.RubyFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendNodeJsBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendRubyBottomNavigationBinding;

public class BackendRubyBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendRubyBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend_ruby_bottom_navigation);
        binding = ActivityBackendRubyBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new RubyFragementWebsite());
        binding.RubybottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new RubyFragementWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new RubyFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.RubyframeLayout, fragment)
                .commit();
    }
}