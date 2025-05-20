package com.gevernova.onlineorderprocessing;

// Thrown when address is invalid or incomplete
public class InvalidAddressException extends RuntimeException {
    public InvalidAddressException(String msg) {
        super(msg);
    }
}
