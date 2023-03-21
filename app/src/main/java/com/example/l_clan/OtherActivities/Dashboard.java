package com.example.l_clan.OtherActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.l_clan.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Dashboard extends AppCompatActivity {
    Button gotosignup;
    Button go;
    ImageView logo_image;
    TextView logo_name;
    TextView slogan;
    TextInputLayout username1;
    TextInputEditText username1text;
    TextInputLayout password1;
    TextInputEditText password1text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);
        logo_image = findViewById(R.id.logo_image1);
        logo_name = findViewById(R.id.logo_name1);
        slogan = findViewById(R.id.slogan1);
        username1 = findViewById(R.id.username1);
        username1text = findViewById(R.id.username1text);
        password1 = findViewById(R.id.password1);
        password1text= findViewById(R.id.password1text);
        gotosignup = findViewById(R.id.gotosignup1);
        go = findViewById(R.id.go1);
        gotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, signup_page.class);
                Pair[] pairs = new Pair[6];
                pairs[0] = new Pair<View,String>(logo_image,"logo_image");
                pairs[1] = new Pair<View,String>(logo_name,"logo_name");
                pairs[2] = new Pair<View,String>(slogan,"slogan");
                pairs[3] = new Pair<View,String>(username1,"username");
                pairs[4] = new Pair<View,String>(password1,"password");
                pairs[5] = new Pair<View,String>(go,"go");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Dashboard.this,pairs);
                startActivity(intent,options.toBundle());
            }
        });

    }
    private boolean validateusername2(){
        String val = username1.getEditText().getText().toString();
        String whitespaces = "\\A\\w{4,20}\\z";

        if (val.isEmpty()){
            username1.setError("field cannot be empty");
            return false;
        }
        else{
            username1.setError(null);
            username1.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validatenamepassword2(){
        String val = password1.getEditText().getText().toString();
        if (val.isEmpty()){
            password1.setError("field cannot be empty");
            return false;
        }
        else{password1.setError(null);
            password1.setErrorEnabled(false);
            return true;
        }
    }
    public void loginuser(View view){
        if (!validateusername2() | !validatenamepassword2()){
            return;
        }
        else{
            isuser();
        }
    }

    private void isuser() {
        String usernamebyuser = username1text.getText().toString();  //also can work by adding getEdittext
        String passwordbyuser = password1text.getText().toString();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");

        Query checkusers = reference.orderByChild("username2").equalTo(usernamebyuser);

        checkusers.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    username1.setError(null);
                    username1.setErrorEnabled(false);

                    String passwordfromDB = snapshot.child(usernamebyuser).child("password2").getValue(String.class);
                        if (passwordfromDB.equals(passwordbyuser)) {
                            username1.setError(null);
                            username1.setErrorEnabled(false);

                            String fullnamefromDB = snapshot.child(usernamebyuser).child("fullname2").getValue(String.class);
                            String emailfromDB = snapshot.child(usernamebyuser).child("email2").getValue(String.class);
                            String phonenofromDB = snapshot.child(usernamebyuser).child("phoneno2").getValue(String.class);
                            String usernamefromDB = snapshot.child(usernamebyuser).child("username2").getValue(String.class);

                            Intent intent = new Intent(Dashboard.this, userprofile.class);

                            intent.putExtra("fullname2", fullnamefromDB);
                            intent.putExtra("username2", usernamefromDB);
                            intent.putExtra("email2", emailfromDB);
                            intent.putExtra("phoneno2", phonenofromDB);
                            intent.putExtra("password2", passwordfromDB);

                            startActivity(intent);
                        } else {
                            password1.setError("password doesnot match");
                            password1.requestFocus();
                        }
                }
                else {

                    username1.setError("user does not exist");
                    username1.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}