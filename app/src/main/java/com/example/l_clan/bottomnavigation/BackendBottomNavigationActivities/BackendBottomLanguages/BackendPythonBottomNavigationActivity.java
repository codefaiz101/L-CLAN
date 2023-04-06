package com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.PHPFragment.PHPFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.PHPFragment.PHPFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.PythonFragment.PythonFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.PythonFragment.PythonFragmentYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendPhpbottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendPythonBottomNavigationBinding;

public class BackendPythonBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendPythonBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend_python_bottom_navigation);
        binding = ActivityBackendPythonBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new PythonFragmentWebsite());
        binding.PythonbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new PythonFragmentWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new PythonFragmentYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.PythonframeLayout, fragment)
                .commit();
    }
}