package com.example.l_clan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Models.FrontendModels;
import com.example.l_clan.R;

import java.util.ArrayList;

public class FrontendAdapter extends RecyclerView.Adapter<FrontendAdapter.viewHolder> {
    ArrayList<FrontendModels> list;
    Context context;

    public FrontendAdapter(ArrayList<FrontendModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.ftechnologysinglelayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
      FrontendModels model = list.get(position);
      holder.imageView.setImageResource(model.getPic());
      holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.HTMLImage);
            textView = itemView.findViewById(R.id.HTMLText);
        }
    }
}
