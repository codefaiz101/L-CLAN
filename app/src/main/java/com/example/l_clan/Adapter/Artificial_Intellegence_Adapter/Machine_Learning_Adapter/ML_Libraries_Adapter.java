package com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_Libraries_Model;
import com.example.l_clan.R;

import java.util.ArrayList;

public class ML_Libraries_Adapter extends RecyclerView.Adapter<ML_Libraries_Adapter.viewHolder>{
    ArrayList<ML_Libraries_Model> list;
    Context context;

    public ML_Libraries_Adapter(ArrayList<ML_Libraries_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ML_Libraries_Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ml_libraries_recycleview,parent,false);
        return new ML_Libraries_Adapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ML_Libraries_Adapter.viewHolder holder, int position) {
        ML_Libraries_Model models = list.get(position);
        holder.imageView.setImageResource(models.getPic());
        holder.textView.setText(models.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class viewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ML_ScikitLearn_Image);
            textView = itemView.findViewById(R.id.ML_Scikitlearn_Text);
        }
    }
}
