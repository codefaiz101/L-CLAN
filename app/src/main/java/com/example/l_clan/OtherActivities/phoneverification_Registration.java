package com.example.l_clan.OtherActivities;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.example.l_clan.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.TimeUnit;

public class phoneverification_Registration extends AppCompatActivity {
    Button verifyotpbtn;
    PinView pinview;
    ProgressBar progressbarverifyno;
    String verificationIdG;
    PhoneAuthProvider.ForceResendingToken mResendToken;
    TextView showphoneno;
    FirebaseAuth mAuth;

    FirebaseDatabase thedatabase;  //root-node
    DatabaseReference reference;  //reference
    UserHelperClass helperClass;  //helper class

    public static String verifyotptext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phnnovrf);
        verifyotpbtn = findViewById(R.id.verifyotpbtn);
        pinview = findViewById(R.id.pinview);
        progressbarverifyno = findViewById(R.id.progressbarverifyno);
        progressbarverifyno.setVisibility(View.INVISIBLE);
        showphoneno = findViewById(R.id.textviewshowphoneno);
        mAuth = FirebaseAuth.getInstance();

        String phoneno = getIntent().getStringExtra("phoneno");
        showphoneno.setText(String.format("Verification code send to +91-%s",phoneno));

        sendverificationcodetouser(phoneno);

        InputMethodManager inputMethodManager =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,InputMethodManager.HIDE_IMPLICIT_ONLY);

        pinview.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().length()==6){
                    verifyotptext = s.toString() ;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        
        verifyotpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                @NonNull String code = verifyotptext;
                if(code.isEmpty() || code.length()!=6){
                    Toast.makeText(phoneverification_Registration.this, "ENTER CORRECT OTP", Toast.LENGTH_SHORT).show();
                    pinview.requestFocus();
                    return;
                }
                progressbarverifyno.setVisibility(View.VISIBLE);
                verifycode(code);
            }
        });
    }

    private void sendverificationcodetouser(String phoneno) {
        progressbarverifyno.setVisibility(View.VISIBLE);
//        RecaptchaVerifierOptions options = new RecaptchaVerifierOptions.Builder()
//                .setInvisible() // Set the reCAPTCHA to invisible
//                .build();
//        RecaptchaVerifier verifier = new RecaptchaVerifier(this, options);
        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber("+91"+phoneno)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // (optional) Activity for callback binding
//                        .setActivity(TaskExecutors.MAIN_THREAD)    // for automatic verification
                        // If no activity is passed, reCAPTCHA verification can not be used.
                        .setCallbacks(mCallbacks)          // OnVerificationStateChangedCallbacks
//                        .setRecaptchaVerifier(verifier)
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
//        mAuth.setLanguageCode("In");
        // To apply the default app language instead of explicitly setting it.
        // auth.useAppLanguage();

    }
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential credential) {
            String code = credential.getSmsCode();
            verifycode(code);
            // This callback will be invoked in two situations:
            // 1 - Instant verification. In some cases the phone number can be instantly
            //     verified without needing to send or enter a verification code.
            // 2 - Auto-retrieval. On some devices Google Play services can automatically
            //     detect the incoming verification SMS and perform verification without
            //     user action.
            Log.d(TAG, "onVerificationCompleted:" + credential);
//            signinbycredentials(credential);
//            signInWithPhoneAuthCredential(credential);
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            // This callback is invoked in an invalid request for verification is made,
            // for instance if the the phone number format is not valid.
            Log.w(TAG, "onVerificationFailed", e);

            if (e instanceof FirebaseAuthInvalidCredentialsException) {
                // Invalid request
            } else if (e instanceof FirebaseTooManyRequestsException) {
                // The SMS quota for the project has been exceeded
            } else if (e instanceof FirebaseAuthMissingActivityForRecaptchaException) {
                // reCAPTCHA verification attempted with null Activity
            }

            // Show a message and update the UI
        }

        @Override
        public void onCodeSent(@NonNull String verificationId,
                @NonNull PhoneAuthProvider.ForceResendingToken token) {
            pinview.requestFocus();
            // The SMS verification code has been sent to the provided phone number, we
            // now need to ask the user to enter the code and then construct a credential
            // by combining the code with a verification ID.
            Log.d(TAG, "onCodeSent:" + verificationId);

            // Save verification ID and resending token so we can use them later
            super.onCodeSent(verificationId, token);
            verificationIdG = verificationId;
            mResendToken = token;
        }
    };
    private void verifycode(String codebyuser){
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationIdG,codebyuser);
        signinbycredentials(credential);
    }
    private void signinbycredentials(PhoneAuthCredential credential) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(phoneverification_Registration.this,new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(phoneverification_Registration.this, "verification successful", Toast.LENGTH_SHORT).show();
                            registeruser();
                            //experiment
//                            Button hcl = signup_page.myActivity.findViewById(R.id.go2);
//                            hcl.setEnabled(true);
//                            findViewById(R.id.go2).setEnabled(true); //not worked
                            //tp
//                            Intent intent = new Intent(getApplicationContext(),userprofile.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(phoneverification_Registration.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    private void registeruser() {
        //just declared database
        thedatabase = FirebaseDatabase.getInstance();
        reference = thedatabase.getReference("users");

        //initialize all
        Intent intent = getIntent();
        String fullname = intent.getStringExtra("fullname");
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        String phoneno = intent.getStringExtra("phoneno");
        String password = intent.getStringExtra("password");

        helperClass = new UserHelperClass(fullname, username, email, phoneno, password);
        reference.child(username).setValue(helperClass);

        Toast.makeText(this, "User Registered Successfully now you can login", Toast.LENGTH_SHORT).show();

        Intent intent1 = new Intent(getApplicationContext(),loginpage.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent1);
    }
}