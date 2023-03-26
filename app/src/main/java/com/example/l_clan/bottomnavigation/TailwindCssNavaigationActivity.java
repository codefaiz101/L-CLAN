package com.example.l_clan.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet.HTMLWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet.HTMLYoutube;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.TailwindCSSFragment.TailwindCSSWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.TailwindCSSFragment.TailwindCSSYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityTailwindCssNavaigationBinding;

public class TailwindCssNavaigationActivity extends AppCompatActivity {
  ActivityTailwindCssNavaigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTailwindCssNavaigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
          replaceFragment(new TailwindCSSWebsite());
        binding.TWbottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new TailwindCSSWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new TailwindCSSYoutube());
                    break;
            }
            return  true;
        });
    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.TWframeLayout, fragment)
                .commit();
    }
}