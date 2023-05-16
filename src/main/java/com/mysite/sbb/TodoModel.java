package com.mysite.sbb;

public class TodoModel {
    // Member Variables
    public int userId;
    public int id;
    public String title;
    public boolean completed;

    public TodoModel(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;

        // completed
        this.completed = completed;
    }
}
