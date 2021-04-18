package com.bridgelabz;

public class userMain {

    /**
     *
     * UC12: exception handling
     *
     * creating objects for every method in the user registration.
     *
     * @param args
     */
    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        userValidation.isFirstnameValid();
        userValidation.isLastnameValid();
        userValidation.isEmailValid();
        userValidation.isMobileFormatValid();
        userValidation.isPasswordValid();
    }
}
