package com.example.l_clan.OtherActivities;

public class UserHelperClass {
    String fullname2,username2,email2,phoneno2,password2,profilepic,reciever;

    public UserHelperClass(String fullname2, String username2, String email2, String phoneno2, String password2) {
        this.fullname2 = fullname2;
        this.username2 = username2;
        this.email2 = email2;
        this.phoneno2 = phoneno2;
        this.password2 = password2;
    }
    public UserHelperClass(String fullname2, String username2, String email2, String phoneno2, String password2,String profile_pic,String reciever) {
        this.fullname2 = fullname2;
        this.username2 = username2;
        this.email2 = email2;
        this.phoneno2 = phoneno2;
        this.password2 = password2;
        this.profilepic = profile_pic;
        this.reciever = reciever;
    }

    public String getReciever(String key) {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public UserHelperClass(){

    }
    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getProfilepic() {
        return profilepic;
    }



    public String getFullname2() {
        return fullname2;
    }

    public void setFullname2(String fullname2) {
        this.fullname2 = fullname2;
    }

    public String getUsername2() {
        return username2;
    }

    public String getUsername2(String key) {
        return username2;
    }


    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPhoneno2() {
        return phoneno2;
    }

    public void setPhoneno2(String phoneno2) {
        this.phoneno2 = phoneno2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getReciever() {
        return  reciever;
    }
}
