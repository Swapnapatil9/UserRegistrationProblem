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

    // pre-defined mobile format
    public static boolean isValidMobileFormat(String mobileNumber){
        return mobileNumber.matches("[0-9]{2}\s[0-9]{10}");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem using Regular expression");
        System.out.println(isValidFirstName("Swapna"));
        System.out.println(isValidLastName("Patil"));
        System.out.println(isValidEmail("swapnapatil629@gmail.com"));
        System.out.println(isValidMobileFormat("91 7894561202"));
    }
}
