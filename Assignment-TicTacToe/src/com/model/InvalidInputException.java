package com.model;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super("Invalid Cell Location");
    }
}
