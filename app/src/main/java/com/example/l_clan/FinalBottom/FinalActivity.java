package com.example.l_clan.FinalBottom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.l_clan.R;
import com.example.l_clan.databinding.ActivityFinalBinding;

public class FinalActivity extends AppCompatActivity {

    ActivityFinalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new FinalDomains());
        binding.finalbottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_domain:
                    replaceFragment(new FinalDomains());
                    break;
                case R.id.navigation_forum:
                    replaceFragment(new FinalForum());
                    break;
            }
            return true;

        });
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.finalframeLayout,fragment).commit();
    }
}