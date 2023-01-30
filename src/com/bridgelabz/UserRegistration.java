package com.bridgelabz;

public class UserRegistration {
    // Validate user first name
    public static boolean isValidFirstName(String fName){
        return fName.matches("[A-Z]{1}[a-z]{2,}");
    }

    // Validate user last name
    public static boolean isValidLastName(String lName){
        return lName.matches("[A-Z]{1}[a-z]{2,}");
    }

    // Validate user email
    public static boolean isValidEmail(String email){
        return email.matches("^[A-Za-z0-9+_.-]+@[a-zA-Z0-9._]+$");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem using Regular expression");
        System.out.println(isValidFirstName("Swapna"));
        System.out.println(isValidLastName("Patil"));
        System.out.println(isValidEmail("swapnapatil629@gmail.com"));
    }
}
