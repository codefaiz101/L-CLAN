package com.example.l_clan.Adapter.Artificial_Intellegence_Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.l_clan.Models.Artificial_Intelligence_Development.Artificial_Intelligence_Model;
import com.example.l_clan.R;
import java.util.ArrayList;

public class Artificial_Intelligence_Adapter extends RecyclerView.Adapter<Artificial_Intelligence_Adapter.viewHolder>{


    ArrayList<Artificial_Intelligence_Model> list;
    Context context;

    public Artificial_Intelligence_Adapter(ArrayList<Artificial_Intelligence_Model> list, Context context) {
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
    public Artificial_Intelligence_Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recylerview_layout,parent,false);
        return new Artificial_Intelligence_Adapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Artificial_Intelligence_Adapter.viewHolder holder, int position) {
        Artificial_Intelligence_Model models = list.get(position);
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
