package com.example.l_clan.forum;

import java.util.Date;

public class Message {
    private String messageText;
    private String sender;
    private Date timestamp;

    public Message(String messageText, String sender, Date timestamp) {
        this.messageText = messageText;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getSender() {
        return sender;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
