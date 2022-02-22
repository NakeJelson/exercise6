package com.company;
import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }

        }

        return userInt;
    }
    public double promptDouble(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userDouble;
    }
    public String promptString(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = "";
        boolean isString = false;
        while(!isString) {
            try {
                int checkInt = Integer.parseInt(userInput);
                System.out.println(checkInt + " is not a String. " + message);
                userInput = scanner.nextLine();
                double checkDouble = Double.parseDouble(userInput);
                System.out.println(checkDouble + " is not a String. " + message);
                userInput = scanner.nextLine();
            }
            catch (Exception e) {
                isString = true;
                userString = userInput;
            }
        }

        return userString;
    }
}


public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println(aNumber + " is an integer");
        double aDouble = input.promptDouble("Enter a double. ");
        System.out.println(aDouble + " is a double");
        String aString = input.promptString("Enter a String. ");
        System.out.println(aString + " is a String");

    }
}

//Jake Nelson 2-22-22 exercise 6