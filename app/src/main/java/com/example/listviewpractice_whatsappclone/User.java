package com.example.listviewpractice_whatsappclone;

public class User {
    int userImage;
    String userName;
    String message;

    public User(int userImage, String userName, String message) {
        this.userImage = userImage;
        this.userName = userName;
        this.message = message;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
