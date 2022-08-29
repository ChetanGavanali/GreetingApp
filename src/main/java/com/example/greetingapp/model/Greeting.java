package com.example.greetingapp.model;

public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String message) {
        this.id = id;
        this.content = message;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
