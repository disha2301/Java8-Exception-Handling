package com.gevernova.librarybooklendingsysten;

public class BookLimitExceededException extends RuntimeException {
    public BookLimitExceededException(String msg) {
        super(msg);
    }
}
