package com.example.l_clan.Models.BackendModels;

import android.widget.ImageView;

public class TTModels {
    String text;
    int pic;

    public TTModels(String text, int pic) {
        this.text = text;
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
