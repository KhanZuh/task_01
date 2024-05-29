package com.example.task_01.models;

public class Celebration {

    private String message;

    // Constructor
    public Celebration(String message) {
        this.message = message;
    }

    // No-argument constructor
    public Celebration() {
    }

    // Getter and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
