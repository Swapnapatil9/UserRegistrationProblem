package com.bridgelabz;

public class UserRegistration {
    // Validate user first name
    public static boolean isValidFirstName(String fName){
        return fName.matches("[A-Z]{1}[a-z]{2,}");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem using Regular expression");
        System.out.println(isValidFirstName("Swapna"));
    }
}
