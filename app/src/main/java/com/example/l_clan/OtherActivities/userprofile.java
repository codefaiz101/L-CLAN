package com.example.l_clan.OtherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import com.example.l_clan.Domains.AndroidDevelopment.AndroidDevelopmentActivity;
import com.example.l_clan.Domains.DomainsPartActivity;
import com.example.l_clan.R;
import com.example.l_clan.forum.forum_main;
import com.example.l_clan.forum.group_chat;
import com.google.firebase.auth.FirebaseAuth;

public class userprofile extends AppCompatActivity {
    TextView showusername;
    Button logout;
    Button waytoforum;
    FirebaseAuth mAuth;
    public static String usernamefromintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        logout = findViewById(R.id.logout);
        waytoforum = findViewById(R.id.waytoforum);
        showusername = findViewById(R.id.showusername);
        mAuth = FirebaseAuth.getInstance();

        Intent intent = getIntent();
        usernamefromintent = intent.getStringExtra("username2");
        showusername.setText(usernamefromintent);
    }
    @Override
    public void onBackPressed() {
        //do nothing
    }
    public void startlearning(View view) {
        Intent intent = new Intent(userprofile.this, DomainsPartActivity.class);
        startActivity(intent);
    }

    public void setWaytoforum(View view) {
        Intent intent = new Intent(userprofile.this, forum_main.class);
        intent.putExtra("username",usernamefromintent);
        startActivity(intent);
    }

    public void logout(View view) {
        mAuth.signOut();
        startActivity(new Intent(userprofile.this, loginpage.class));
        finish();


    }
}