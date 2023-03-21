package com.example.l_clan.OtherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.l_clan.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 2000;

    Animation topanim,bottomanim;
    ImageView logo_image ;
    TextView logo_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topanim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        logo_image = findViewById(R.id.logo_image1);
        logo_name = findViewById(R.id.logo_name1);

        sabbadiya();
    }

    private void sabbadiya() {
        logo_image.setAnimation(topanim);
        logo_name.setAnimation(bottomanim);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentuser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentuser != null) {
            Intent checklogin = new Intent(MainActivity.this, userprofile.class);
            checklogin.putExtra("username2", FirebaseAuth.getInstance().getCurrentUser().toString());
            startActivity(checklogin);
            finish();
        }
        else
        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);

                    Pair[] pairs = new Pair[2];
                    pairs[0] = new Pair<View, String>(logo_image, "logo_image");
                    pairs[1] = new Pair<View, String>(logo_name, "logo_name");

                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                    startActivity(intent, options.toBundle());

                }
            }, SPLASH_SCREEN);
        }
    }
}