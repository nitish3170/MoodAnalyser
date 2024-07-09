package org.example;

public class CustomException extends Exception {
    public enum ExceptionType {
        NULL, EMPTY
    }
    public ExceptionType type;

    public CustomException(ExceptionType type, String message) {
        super(message);
        this.type=type;
        }
    }
