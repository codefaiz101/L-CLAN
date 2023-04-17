package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_C_Plus_Fragment.Ai_C_Plus_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_C_Plus_Fragment.Ai_C_Plus_Fragment_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityAiCplusBottomNavigationBinding;

public class AI_C_Plus_BottomNavigationActivity extends AppCompatActivity {

    ActivityAiCplusBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAiCplusBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Ai_C_Plus_Fragment_Website());
        binding.AiCPlusBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new Ai_C_Plus_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new Ai_C_Plus_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.AICPlusBottomNavigationLayout, fragment)
                .commit();
    }
}