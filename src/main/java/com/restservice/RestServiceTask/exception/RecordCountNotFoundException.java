package com.restservice.RestServiceTask.exception;

public class RecordCountNotFoundException extends RuntimeException{
    public RecordCountNotFoundException(String message) {
        super(message);
    }
}
