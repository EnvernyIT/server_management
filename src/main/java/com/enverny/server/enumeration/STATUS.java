package com.enverny.server.enumeration;

public enum STATUS {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    STATUS(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
