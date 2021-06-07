package com.gfa.backendapi.models;

public class ErrorsGreeter {
   private String error;

    public ErrorsGreeter(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
