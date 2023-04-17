package com.example.l_clan.Adapter.Android_Development_Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.l_clan.Models.Android_Development.JavaResourcesModel;
import com.example.l_clan.R;

import java.util.ArrayList;
public class JavaResourceAdapter extends  RecyclerView.Adapter<JavaResourceAdapter.viewHolder> {


        ArrayList<JavaResourcesModel> list;
        Context context;
        public JavaResourceAdapter(ArrayList<JavaResourcesModel> list, Context context) {
            this.list = list;
            this.context = context;
        }


        @NonNull
        @Override
        public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.javaandroidsinglerv,parent,false);
            return new viewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull viewHolder holder, int position) {
            JavaResourcesModel models = list.get(position);
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
                imageView1 = itemView.findViewById(R.id.java_resources_image);
                textView = itemView.findViewById(R.id.java_resources_text);
            }
        }
    }
