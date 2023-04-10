package com.example.l_clan.bottomnavigation.BackendFrameworksFragmentpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.RubyonRailsFragment.RubyRailsFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.RubyonRailsFragment.RubyRailsFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendFrameworkRubyOnRailsBottomNavigationBinding;

public class BackendFrameworkRubyOnRailsBottomNavigationActivity extends AppCompatActivity {
    ActivityBackendFrameworkRubyOnRailsBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBackendFrameworkRubyOnRailsBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new RubyRailsFragmentWebsite());
        binding.BackendFrameworkRubyOnRailsNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new RubyRailsFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new RubyRailsFragmentYoutube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.BackendFrameworkRubyOnRailsLayout, fragment)
                .commit();
    }
}