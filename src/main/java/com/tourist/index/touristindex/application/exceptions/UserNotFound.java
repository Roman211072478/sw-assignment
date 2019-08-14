package com.tourist.index.touristindex.application.exceptions;

public class UserNotFound extends RuntimeException {

    public UserNotFound() {
        super("User not found");
    }
}
