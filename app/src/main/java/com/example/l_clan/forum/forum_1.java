package com.example.l_clan.forum;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.R;
//import com.example.l_clan.databinding.ActivityForum1Binding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forum_1 extends AppCompatActivity {

//   ActivityForum1Binding binding ;  //to replace find view by id

    private RecyclerView recyclerView;
    private MessageAdapter adapter;
    private List<Message> messageList = new ArrayList<>();
    private EditText messageEditText;
    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private String username;
    FirebaseDatabase thedatabase;  //root-node
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = ActivityForum1Binding.inflate(getLayoutInflater());     //to replace find view by id
        setContentView(R.layout.activity_forum_1);        //to replace find view by id

        recyclerView = findViewById(R.id.recyclerView);
        messageEditText = findViewById(R.id.messageEditText);
        Button sendButton = findViewById(R.id.sendButton);

        adapter = new MessageAdapter(this, messageList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

//        FirebaseAuth mAuth = FirebaseAuth.getInstance();
//        FirebaseUser[] currentUser = {mAuth.getCurrentUser()};
//
//                if (currentUser != null) {
//                    Toast.makeText(forum_1.this, "User logged in", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(forum_1.this, "User not logged in", Toast.LENGTH_SHORT).show();
//                }
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messageText = messageEditText.getText().toString().trim();
                Intent intent = getIntent();
                String sender = intent.getStringExtra("username");

                if (!messageText.isEmpty()) {
                    DatabaseReference newMessageRef = mDatabase.child("messages").push();
                    Map<String, Object> messageMap = new HashMap<>();
                    messageMap.put("messageText", messageText);
                    messageMap.put("sender", sender);
                    messageMap.put("timestamp", ServerValue.TIMESTAMP);
                    newMessageRef.setValue(messageMap, new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                            if (error != null) {
                                Log.d("setValue", "Error: " + error.getMessage());
                            } else {
                                Log.d("setValue", "Message data saved to Firebase: " + messageText);
                            }
                        }
                    });
                    messageEditText.getText().clear();
                } else {
                    Toast.makeText(forum_1.this, "Please enter a message", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("messages");
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                if (dataSnapshot.exists()) {
                    String text = "";
                    String sender = "";
                    Date timestamp = null;
                    if (dataSnapshot.child("messageText").getValue() != null) {
                        text = dataSnapshot.child("messageText").getValue().toString();
                    }
                    if (dataSnapshot.child("sender").getValue() != null) {
                        sender = dataSnapshot.child("sender").getValue().toString();
                    }
                    if (dataSnapshot.child("timestamp").getValue() != null) {
                        timestamp = new Date((Long) dataSnapshot.child("timestamp").getValue());
                    }

                    Message message = new Message(text, sender, timestamp);
                    messageList.add(message);
                    recyclerView.scrollToPosition(messageList.size() - 1);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {}

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {}

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {}

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {Log.d("notworking","nononno"+databaseError);}
        });
    }
}
