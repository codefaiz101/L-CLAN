package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_Keras_Libraries_Fragment.Ml_Keras_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Machine_Learning.ML_Keras_Libraries_Fragment.Ml_Keras_Fragment_Youtube;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityMlGcpBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityMlKerasBottomNavigationBinding;

public class Ml_Keras_BottomNavigationActivity extends AppCompatActivity {

    ActivityMlKerasBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMlKerasBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Ml_Keras_Fragment_Website());
        binding.MlKerasBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new Ml_Keras_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new Ml_Keras_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.MlKerasBottomNavigationLayout, fragment)
                .commit();
    }
}