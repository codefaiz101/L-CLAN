package com.example.l_clan.bottomnavigation.BackendBottomNavigationActivities.BackendBottomLanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment.DjangoFragmentWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.FrameworksFragmentpart.DjangoFragment.DjangoFragmentYoutube;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.NodejsFragment.NodeJsFragmentaWebsite;
import com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.ProgramminLangugesFragmentpart.NodejsFragment.NodeJsFragmentaYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBackendDjangoBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendJavaBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityBackendNodeJsBottomNavigationBinding;

public class BackendNodeJsBottomNavigationActivity extends AppCompatActivity {

    ActivityBackendNodeJsBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend_node_js_bottom_navigation);

        binding = ActivityBackendNodeJsBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new NodeJsFragmentaWebsite());
        binding.NodeJsbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new NodeJsFragmentaWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new NodeJsFragmentaYoutube());
                    break;
            }
            return  true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.NodeJsframeLayout, fragment)
                .commit();
    }

}