package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.Ml_CC_Platforms_BottomNavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_CC_AWS_Platform_Fragment.ML_CC_AWS_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_CC_AWS_Platform_Fragment.ML_CC_AWS_Fragment_Youtube;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_AWS_Fragments.NN_CloudPlatform_AWS_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_AWS_Fragments.NN_CloudPlatform_AWS_Fragment_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityMlAwsBottomNavigationBinding;

public class MlawsBottomNavigationActivity extends AppCompatActivity {

    ActivityMlAwsBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMlAwsBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new ML_CC_AWS_Fragment_Website());
        binding.MlAwsBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new ML_CC_AWS_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new ML_CC_AWS_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.MlAwsBottomNavigationLayout, fragment)
                .commit();
    }
}