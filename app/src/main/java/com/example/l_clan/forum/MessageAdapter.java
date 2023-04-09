package com.example.l_clan.forum;
import com.example.l_clan.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private Context context;
    private List<Message> messageList;

    public MessageAdapter(Context context, List<Message> messageList) {
        this.context = context;
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_item_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Message message = messageList.get(position);
        holder.messageTextView.setText(message.getMessageText());
        holder.senderTextView.setText(message.getSender());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault());
        holder.timestampTextView.setText(dateFormat.format(message.getTimestamp()));
    }


    @Override
    public int getItemCount() {
        return messageList.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {

        TextView messageTextView;
        TextView senderTextView;
        TextView timestampTextView;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            messageTextView = itemView.findViewById(R.id.messageTextView);
            timestampTextView = itemView.findViewById(R.id.timestampTextView);
            senderTextView = itemView.findViewById(R.id.senderTextView);
        }
    }
}

