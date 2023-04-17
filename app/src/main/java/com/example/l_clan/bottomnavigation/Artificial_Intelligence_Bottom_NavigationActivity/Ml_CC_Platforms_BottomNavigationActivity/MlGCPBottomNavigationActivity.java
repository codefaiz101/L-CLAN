package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.Ml_CC_Platforms_BottomNavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_CC_GCP_Platform_Fragment.ML_CC_GCP_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_CC_GCP_Platform_Fragment.ML_CC_GCP_Fragment_Youtube;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityMlGcpBottomNavigationBinding;

public class MlGCPBottomNavigationActivity extends AppCompatActivity {

    ActivityMlGcpBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMlGcpBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new ML_CC_GCP_Fragment_Website());
        binding.MlGCPBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new ML_CC_GCP_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new ML_CC_GCP_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.MlGCPBottomNavigationLayout, fragment)
                .commit();
    }
}