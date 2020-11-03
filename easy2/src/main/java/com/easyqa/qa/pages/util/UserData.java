package com.easyqa.qa.pages.util;

public class UserData {
    private String userMail;
    private String userPassword;

    public UserData(String userMail, String userPassword) {
        this.userMail = userMail;
        this.userPassword = userPassword;

    }

    public String getUserMail() {
        return this.userMail;
    }

    public String getUserPassword() {
        return this.userPassword;
    }


}


