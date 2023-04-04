package com.example.l_clan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Models.DomainModels;
import com.example.l_clan.R;

import java.util.ArrayList;

public class DomainAdapter extends  RecyclerView.Adapter<DomainAdapter.viewHolder>{
     ArrayList<DomainModels> list;
     Context context;

    public DomainAdapter(ArrayList<DomainModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

//    @Override
//    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
//
//      
//    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recylerview_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
       DomainModels models = list.get(position);
       holder.imageView.setImageResource(models.getPic());
       holder.textView.setText(models.getText());

//       switch (position){
//           case 0:
//               holder.imageView.setOnClickListener(new View.OnClickListener() {
//                   @Override
//                   public void onClick(View v) {
//                       holder.imageView.setOnClickListener(new View.OnClickListener() {
//                           @Override
//                           public void onClick(View v) {
//                               Intent intent = new Intent(DomainsPartActivity.this,MainActivity2.class);
//                               startActivity(intent);
//                           }
//                       });
//                   }
//               });
//       }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.Androidimage);
            textView = itemView.findViewById(R.id.Androidtext);
        }
    }


}
