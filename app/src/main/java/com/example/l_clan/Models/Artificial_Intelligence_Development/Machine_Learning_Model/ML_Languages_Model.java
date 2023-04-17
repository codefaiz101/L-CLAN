package com.example.l_clan.Models.Artificial_Intelligence_Development.Machine_Learning_Model;

public class ML_Languages_Model {
    String text;
    int pic;

    public ML_Languages_Model(String text, int pic) {
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

