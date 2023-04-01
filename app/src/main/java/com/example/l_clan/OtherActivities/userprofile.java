package com.example.l_clan.OtherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import com.example.l_clan.Domains.AndroidDevelopment.AndroidDevelopmentActivity;
import com.example.l_clan.Domains.DomainsPartActivity;
import com.example.l_clan.FinalBottom.FinalActivity;
import com.example.l_clan.R;
import com.google.firebase.auth.FirebaseAuth;

public class userprofile extends AppCompatActivity {
    TextView showusername;
    Button logout;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        logout = findViewById(R.id.logout);
        showusername = findViewById(R.id.showusername);
        mAuth = FirebaseAuth.getInstance();

        showusernamefun();
    }

    private void showusernamefun() {
        Intent intent = getIntent();
        String usernamefromintent = intent.getStringExtra("username2");
        showusername.setText(usernamefromintent);
    }

    public void startlearning(View view) {
        Intent intent = new Intent(userprofile.this, FinalActivity.class);
        startActivity(intent);
    }

    public void logout(View view) {
        mAuth.signOut();
        startActivity(new Intent(userprofile.this, Dashboard.class));
        finish();


    }
}