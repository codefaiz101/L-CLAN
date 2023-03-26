package com.example.l_clan.Adapter.BackendAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Domains.WebDevelopment.Backend.BackendActivity;
import com.example.l_clan.Models.BackendModels.FrameworksModels;
import com.example.l_clan.Models.BackendModels.TTModels;
import com.example.l_clan.R;

import java.util.ArrayList;

public class TTAdapter extends  RecyclerView.Adapter<TTAdapter.viewHolder> {
    ArrayList<TTModels> list;
    Context context;

    public TTAdapter(ArrayList<TTModels> list, Context context) {
        this.context =context;
        this.list =list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ttsinglerecyclerlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        TTModels models = list.get(position);
        holder.imageView.setImageResource(models.getPic());
        holder.textView.setText(models.getText());
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
            imageView = itemView.findViewById(R.id.JestImage);
            textView = itemView.findViewById(R.id.JestText);
        }
    }
}
