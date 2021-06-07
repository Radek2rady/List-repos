package com.gfa.backendapi.models;

public class Greeter {
private String welcome_message;

    public Greeter() {
    }

    public Greeter(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
