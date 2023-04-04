package com.example.l_clan.Models.BackendModels;

public class FrameworksModels {
    String text;
    int pic;

    public FrameworksModels(String text, int pic) {
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
