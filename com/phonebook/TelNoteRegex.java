package com.phonebook;

import java.util.Scanner;

/**
 * Data Validation Class
 */
public class TelNoteRegex {
    // Validation of Menu Input Number
    public int menuItemValidate(int min, int max) {
        // Define regular expression for validating menu items
        String regex = "[" + min + "-" + max + "]";
        // Create keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a valid number, the minimum number is: " + min + ", the maximum number is: " + max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return Integer.parseInt(input);
            }
            System.out.println("Invalid input. Please enter it again!");
        }
    }

    // Validation of name - uppercase or lowercase letters, length 1-10
    public String nameValidate() {
        // Define regular expression for validating names
        String regex = "[a-zA-Z]{1,10}";
        // Create keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name: (uppercase or lowercase)letters, length 1-10.");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println("Incorrect name entered. Please enter it again!");
        }
    }

    // Validation of age - 10-99
    public String ageValidate() {
        // Define regular expression for validating ages
        String regex = "[1-9][0-9]";
        // Create keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the age: 10-99.");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println("Incorrect age entered. Please enter it again!");
        }
    }

    // Validation of gender - M/m for male, F/f for female
    public String genderValidate() {
        // Define regular expression for validating genders
        String regex = "[M|m|F|f]";
        // Create keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the gender: M/m for male, F/f for female.");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println("Incorrect gender entered. Please enter it again!");
        }
    }

    // Validation of phone number
    public String telNumValidate() {
        // Define regular expression for validating telephone numbers
        String regex = "(\\d{3,4}-\\d{7,8})|([1]\\d{10})";
        // Create keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the telephone number.");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println("Incorrect telephone number entered. Please enter it again!");
        }
    }

    // Validation of address - letters or numbers, length 1-50
    public String addressValidate() {
        // Define regular expression for validating addresses
        String regex = "\\w{1,50}";
        // Create keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the address: (uppercase or lowercase)letters or numbers, length 1-50.");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println("Incorrect address entered. Please enter it again!");
        }
    }
}
