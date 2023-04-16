package com.example.l_clan.forum;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.DomainAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Domains.WebDevelopment.WebActivity;
import com.example.l_clan.OtherActivities.UserHelperClass;
import com.example.l_clan.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class forum_main extends AppCompatActivity {
    FirebaseDatabase database;
    RecyclerView recyclerView_forummain;
    LinearLayout forum_linear_layout_forum_main;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum_main);
        recyclerView_forummain = findViewById(R.id.recyclerView_forummain);
        ArrayList<UserHelperClass> list = new ArrayList<>();

        chatelement_Adapter adapter = new chatelement_Adapter (list, this);
        recyclerView_forummain.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView_forummain.setLayoutManager(layoutManager);

        forum_linear_layout_forum_main = findViewById(R.id.forum_linear_layout_forum_main);

        forum_linear_layout_forum_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent groupchatintent = new Intent(forum_main.this,group_chat.class);
                startActivity(groupchatintent);
            }
        });

        database = FirebaseDatabase.getInstance();

        database.getReference().child("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    UserHelperClass users  = dataSnapshot.getValue(UserHelperClass.class);
                    users.setUsername2(dataSnapshot.getKey());
                    users.setReciever(dataSnapshot.getKey());
                    list.add(users);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        recyclerView_forummain.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView_forummain, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = getIntent();
                String sender = intent.getStringExtra("username");
                switch (position) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        UserHelperClass selectedUser = list.get(position);
                        String receiverName = selectedUser.getReciever();
                        Intent intent1 = new Intent(getApplicationContext(), individual_chat_interface.class);
                        intent1.putExtra("reciever",receiverName);
                        intent1.putExtra("username",sender);
                        startActivity(intent1);
                        break;
                    default:
                        Toast.makeText(forum_main.this, "HIE", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
}
}