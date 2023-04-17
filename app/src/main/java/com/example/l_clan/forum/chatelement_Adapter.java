package com.example.l_clan.forum;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.l_clan.OtherActivities.UserHelperClass;
import com.example.l_clan.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class chatelement_Adapter extends RecyclerView.Adapter<chatelement_Adapter.Viewholder>{
    ArrayList<UserHelperClass> list;
    Context context;

    public chatelement_Adapter(ArrayList<UserHelperClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.forum_chatelements,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        UserHelperClass users = list.get(position);
        Picasso.get().load(users.getProfilepic()).placeholder(R.drawable.userprofile).into(holder.profile_image);
        holder.username.setText(users.getUsername2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        ImageView profile_image;
        TextView username,topmessage;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            profile_image = itemView.findViewById(R.id.profile_image);
            username = itemView.findViewById(R.id.username);
//            topmessage = itemView.findViewById(R.id.topmessage);

        }
    }
}
