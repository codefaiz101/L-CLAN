package com.example.l_clan.OtherActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.l_clan.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class phnnovrf extends AppCompatActivity {
    Button verifyotpbtn, sendvrfcode, successfull;
    EditText verifyotp;
    ProgressBar progressbarverifyno;
    String verificationIdG;
    FirebaseAuth mAuth;

//    signup_page.myActivity=this;  //bagu lagla tr wapru

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phnnovrf);
        verifyotpbtn = findViewById(R.id.verifyotpbtn);
        verifyotp = findViewById(R.id.verifyotp);
        progressbarverifyno = findViewById(R.id.progressbarverifyno);
        progressbarverifyno.setVisibility(View.INVISIBLE);
        sendvrfcode = findViewById(R.id.sendvrfcode);
        successfull = findViewById(R.id.successfull);
        successfull.setEnabled(false);
        successfull.setVisibility(View.INVISIBLE);
        mAuth = FirebaseAuth.getInstance();

        /*
code for action bar
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
take input phone no
*/


        String phoneno = getIntent().getStringExtra("phoneno");

        //display phone no for reconfirmation
        Toast.makeText(this, phoneno, Toast.LENGTH_SHORT).show();

        //start process
        sendvrfcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sendverificationcodetouser(phoneno);
            }
        });
        
        verifyotpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                @NonNull String code = verifyotp.getText().toString();
                progressbarverifyno.setVisibility(View.VISIBLE);
                verifycode(code);
            }
        });

        successfull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), signup_page.class);
                startActivityForResult(myIntent, 0);
                return;
            }
        });
    }

    private void sendverificationcodetouser(String phoneno) {
        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber("+91"+phoneno)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(mCallbacks)          // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential credential) {
                final String code = credential.getSmsCode();
                if (code!=null){
                    Toast.makeText(phnnovrf.this, "code not null", Toast.LENGTH_SHORT).show();
                    successfull.setEnabled(true);
                    successfull.setVisibility(View.VISIBLE);
                }
            else{
                    Toast.makeText(phnnovrf.this, "didnt get the code from sms", Toast.LENGTH_SHORT).show();
                }
        }
        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(phnnovrf.this, "verification failed", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCodeSent(@NonNull String verificationId,
                @NonNull PhoneAuthProvider.ForceResendingToken token)
        {
            super.onCodeSent(verificationId, token);
            verificationIdG = verificationId;
        }
    };
    private void verifycode(String code){
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationIdG,code);
        signinbycredentials(credential);
    }

    private void signinbycredentials(PhoneAuthCredential credential) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(phnnovrf.this, "verification successful", Toast.LENGTH_SHORT).show();
                            //experiment
                            Button myButton=(Button) signup_page.myActivity.findViewById(R.id.go2);
                            myButton.setEnabled(true);
//                            findViewById(R.id.go2).setEnabled(true); //not worked
                            //tp
//                            Intent intent = new Intent(getApplicationContext(),userprofile.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(phnnovrf.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}