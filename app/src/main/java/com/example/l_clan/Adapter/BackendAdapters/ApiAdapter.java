package com.example.l_clan.Adapter.BackendAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Models.BackendModels.ApisModel;
import com.example.l_clan.R;

import java.util.ArrayList;

public class ApiAdapter extends  RecyclerView.Adapter<ApiAdapter.viewHolder>{
    ArrayList<ApisModel> list;
    Context context;

    public ApiAdapter(ArrayList<ApisModel> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public ApiAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dbmssinglerecyclerview,parent,false);
        return new ApiAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ApiAdapter.viewHolder holder, int position) {
        ApisModel models = list.get(position);
        holder.imageView.setImageResource(models.getPic());
        holder.textView.setText(models.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class viewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView ;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.APIImage);
            textView = itemView.findViewById(R.id.APIText);

        }
    }
}

