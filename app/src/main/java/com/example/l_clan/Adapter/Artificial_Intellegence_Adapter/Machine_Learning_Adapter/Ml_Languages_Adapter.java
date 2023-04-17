package com.example.l_clan.Adapter.Artificial_Intellegence_Adapter.Machine_Learning_Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model.ML_Languages_Model;
import com.example.l_clan.R;
import java.util.ArrayList;

public class Ml_Languages_Adapter extends  RecyclerView.Adapter<Ml_Languages_Adapter.viewHolder> {


    ArrayList<ML_Languages_Model> list;
    Context context;
    public Ml_Languages_Adapter(ArrayList<ML_Languages_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public Ml_Languages_Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ml_languages_recyclerview,parent,false);
        return new Ml_Languages_Adapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Ml_Languages_Adapter.viewHolder holder, int position) {
        ML_Languages_Model models = list.get(position);
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
            imageView1 = itemView.findViewById(R.id.ML_Language_Image);
            textView = itemView.findViewById(R.id.ML_Language_Text);
        }
    }
}