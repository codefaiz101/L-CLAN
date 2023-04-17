package com.example.l_clan.Models.Artificial_Intelligence_Development.AI_Basic_learning_Model;

public class ai_basic_learning_Model {
    String text;
    int pic;

    public ai_basic_learning_Model(String text, int pic) {
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
