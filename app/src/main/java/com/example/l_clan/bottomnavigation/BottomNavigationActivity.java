package com.example.l_clan.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet.HTMLWebsite;
import com.example.l_clan.Domains.WebDevelopment.Frontend.Fragment.HtmlFragemet.HTMLYoutube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityBottomNavigationBinding;

public class BottomNavigationActivity extends AppCompatActivity {
    ActivityBottomNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HTMLWebsite());
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            /*This is default code */
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new HTMLWebsite());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new HTMLYoutube());
                    break;
            }
            return  true;

        });


        //Modified version of code


// Method to replace the current fragment



    }





private void replaceFragment(Fragment fragment) {
    getSupportFragmentManager().beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit();
}
}