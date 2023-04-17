package com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.ai_basic_learning_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l_clan.Models.Artificial_Intelligence_Development.AI_Basic_learning_Model.ai_basic_learning_Model;
import com.example.l_clan.R;
import java.util.ArrayList;

public class ai_basic_Learning_adapter extends RecyclerView.Adapter<ai_basic_Learning_adapter.viewHolder>{
    ArrayList<ai_basic_learning_Model> list;
    Context context;

    public ai_basic_Learning_adapter(ArrayList<ai_basic_learning_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ai_basic_Learning_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ai_development_ailearning_recyclerview,parent,false);
        return new ai_basic_Learning_adapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ai_basic_Learning_adapter.viewHolder holder, int position) {
        ai_basic_learning_Model models = list.get(position);
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
            imageView = itemView.findViewById(R.id.AI_java_Image);
            textView = itemView.findViewById(R.id.AI_java_Text);
        }
    }
}
