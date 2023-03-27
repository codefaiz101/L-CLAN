package com.example.l_clan.Adapter.BackendAdapters;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.l_clan.Models.BackendModels.DeploymentModel;
import com.example.l_clan.Models.BackendModels.FrameworksModels;
import com.example.l_clan.R;

import java.util.ArrayList;

public class DeploymentAdapter extends RecyclerView.Adapter<DeploymentAdapter.viewHolder> {
    ArrayList<DeploymentModel> list;
    Context context;

    public DeploymentAdapter(ArrayList<DeploymentModel>list,Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DeploymentAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.deploymentsinglelayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DeploymentModel models = list.get(position);
        holder.imageView1.setImageResource(models.getPic());
        holder.textView.setText(models.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView1;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.kubernates_image);
            textView = itemView.findViewById(R.id.kubernates_text);
        }
    }
}