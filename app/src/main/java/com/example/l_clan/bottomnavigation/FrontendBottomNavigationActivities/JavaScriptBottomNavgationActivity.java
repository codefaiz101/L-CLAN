package com.example.l_clan.bottomnavigation.FrontendBottomNavigationActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.javaScriptFragment.JavaScriptWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.javaScriptFragment.JavaScriptYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityJavaScriptBottomNavgationBinding;

public class JavaScriptBottomNavgationActivity extends AppCompatActivity {
     ActivityJavaScriptBottomNavgationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJavaScriptBottomNavgationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new JavaScriptWebsite());
        binding.jsbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new JavaScriptWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new JavaScriptYoutube());
                    break;
            }
            return true;
        });

    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.jsframeLayout, fragment)
                .commit();
    }
}

