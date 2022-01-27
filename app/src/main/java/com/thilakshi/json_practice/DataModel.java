package com.thilakshi.json_practice;

import java.security.PrivateKey;

public class DataModel {

    //This class will be as  a template for the data that we are going tp pharse

    private int userId;

    private int id;

    private String title;

    private boolean completed;

    //getters


    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}
