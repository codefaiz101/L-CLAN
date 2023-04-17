package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Youtube;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Reinforcement_Learning.Rl_OpenAi_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Reinforcement_Learning.Rl_OpenAi_Fragment_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityMlKerasBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityRlOpenAiBottomNavigationBinding;

public class RL_OpenAi_BottomNavigationActivity extends AppCompatActivity {

    ActivityRlOpenAiBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRlOpenAiBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Rl_OpenAi_Fragment_Website());
        binding.RLOpenAiBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new Rl_OpenAi_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new Rl_OpenAi_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.RLOpenAiBottomNavigationLayout, fragment)
                .commit();
    }
}