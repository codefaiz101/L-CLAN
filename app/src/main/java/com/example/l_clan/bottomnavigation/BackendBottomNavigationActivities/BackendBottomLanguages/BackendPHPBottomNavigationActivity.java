package com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.NodejsFragment.NodeJsFragmentaWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.NodejsFragment.NodeJsFragmentaYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.PHPFragment.PHPFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.PHPFragment.PHPFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendNodeJsBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendPhpbottomNavigationBinding;

public class BackendPHPBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendPhpbottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend_phpbottom_navigation);
        binding = ActivityBackendPhpbottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new PHPFragmentWebsite());
        binding.PHPbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new PHPFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new PHPFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.PHPframeLayout, fragment)
                .commit();
    }
}