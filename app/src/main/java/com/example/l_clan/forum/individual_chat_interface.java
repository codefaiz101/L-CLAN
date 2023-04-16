package com.example.l_clan.forum;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.R;
//import com.example.l_clan.databinding.ActivityForum1Binding;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class individual_chat_interface extends AppCompatActivity {

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
        setContentView(R.layout.activity_individual_chat_interface);        //to replace find view by id

        recyclerView = findViewById(R.id.recyclerView_chatface);
        messageEditText = findViewById(R.id.messageEditText_chatface);
        Button sendButton = findViewById(R.id.sendButton_chatface);

        adapter = new MessageAdapter(this, messageList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messageText = messageEditText.getText().toString().trim();
                Intent intent = getIntent();
                String sender = intent.getStringExtra("username");
                String reciever = intent.getStringExtra("reciever");
                final String reciever_room = reciever+sender;
                final String sender_room = sender+reciever;

                if (!messageText.isEmpty()) {
                    DatabaseReference newMessageRef = mDatabase.child("personal_chat").child(sender_room).push();
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
                            DatabaseReference newMessageRef = mDatabase.child("personal_chat").child(reciever_room).push();
                            newMessageRef.setValue(messageMap, new DatabaseReference.CompletionListener() {
                                @Override
                                public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                                    if (error != null) {Log.d("setValue", "Error: " + error.getMessage());} else {Log.d("setValue", "Message data saved to Firebase: " + messageText);}
                                }
                            });
                        }
                    });
                    messageEditText.getText().clear();
                } else {
                    Toast.makeText(individual_chat_interface.this, "Please enter a message", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        String sender = intent.getStringExtra("username");
        String reciever = intent.getStringExtra("reciever");
        final String sender_room = sender+reciever;
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("personal_chat").child(sender_room);
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
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {Log.d("child changed","nononno");}

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {Log.e("onchild removed","nononno");}

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {Log.e("child moved","nononno");}

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {Log.e("cancelled is the","nononno"+databaseError);}
        });
    }
}
