package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_R_Fragment.Ai_R_Programming_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Artificial_Intelligence_Learning.AI_R_Fragment.Ai_R_Programming_Fragment_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityAiRprogrammingBottomNavigationBinding;

public class AI_R_Programming_BottomNavigationActivity extends AppCompatActivity {
    ActivityAiRprogrammingBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAiRprogrammingBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Ai_R_Programming_Fragment_Website());
        binding.AiRProgrammingBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new Ai_R_Programming_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new Ai_R_Programming_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.AIRProgrammingBottomNavigationLayout, fragment)
                .commit();
    }
}