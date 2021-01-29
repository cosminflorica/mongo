package com.example.demo.exceptions;

public class IdentifierExceptionResponse {
    private String identifier;


    public IdentifierExceptionResponse(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
