package com.tourist.index.touristindex.application.exceptions;

public class SuburbNotFound extends RuntimeException {

    public SuburbNotFound() {
        super("Suburb not found");
    }
}
