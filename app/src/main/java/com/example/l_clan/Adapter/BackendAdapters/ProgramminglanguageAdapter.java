package com.example.l_clan.Adapter.BackendAdapters;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Adapter.DomainAdapter;
import com.example.l_clan.Models.BackendModels.ProgramminglanguageModels;
import com.example.l_clan.Models.DomainModels;
import com.example.l_clan.R;

import java.util.ArrayList;

public class ProgramminglanguageAdapter extends  RecyclerView.Adapter<ProgramminglanguageAdapter.viewHolder> {


    ArrayList<ProgramminglanguageModels> list;
    Context context;
    public ProgramminglanguageAdapter(ArrayList<ProgramminglanguageModels> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.backendsinglerv,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
      ProgramminglanguageModels models = list.get(position);
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
             imageView1 = itemView.findViewById(R.id.JavaImage);
             textView = itemView.findViewById(R.id.JavaText);
        }
    }
}
