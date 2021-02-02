package com.techelevator.exceptions;

public class NameFormatException extends Exception {

    @Override
    public String getMessage() {
        return "Insufficient information to properly format name!";
    }
}
