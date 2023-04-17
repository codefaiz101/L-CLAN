package com.example.l_clan.bottomnavigation.Artificial_Intelligence_Bottom_NavigationActivity.ML_Libraries_BottomNavigationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_CloudPlatform_GCP_Fragments.NN_CloudPlatform_GCP_Fragments_Youtube;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_Libraries_Fragment.NN_Libraries_Pytorch_Fragment_Website;
import com.example.l_clan.Domains.ArtificialIntellegenceDevelopment.Neural_Network.NN_Libraries_Fragment.NN_Libraries_Pytorch_Fragment_Youtube;
import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityMlKerasBottomNavigationBinding;
import com.example.l_clan.databinding.ActivityNnPytorchBottomNavigationBinding;

public class NN_Pytorch_BottomNavigationActivity extends AppCompatActivity {

    ActivityNnPytorchBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNnPytorchBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new NN_Libraries_Pytorch_Fragment_Website());
        binding.NNPytorchBottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_website:
                    replaceFragment(new NN_Libraries_Pytorch_Fragment_Website());
                    break;
                case R.id.navigation_youtube:
                    replaceFragment(new NN_Libraries_Pytorch_Fragment_Youtube());
                    break;
            }
            return true;
        });


    }
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.NNPytorchBottomNavigationLayout, fragment)
                .commit();
    }
}