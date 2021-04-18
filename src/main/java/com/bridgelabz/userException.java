package com.bridgelabz;

public class userException extends Exception {
    /**
     * this method creates exception for invalid outcomes
     *
     * @return error message as Invalid output or failure
     *
     */
    String errorMessage;
    public userException(String message) {
        this.errorMessage = message;
    }
}
