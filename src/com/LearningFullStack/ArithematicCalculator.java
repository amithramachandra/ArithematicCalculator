package com.LearningFullStack;

import java.util.Scanner;

public class ArithematicCalculator {

    public static void main(String[] args) {

        //Welcome Message to the User
        System.out.println("Welcome to the Basic Arithematic Calculator");
        System.out.println();

        //declaring variables
        char operator;
        double number1, number2, result;

        //object to scan user input values
        Scanner input = new Scanner(System.in);


        // Message to enter number
        System.out.print("Enter first number: ");

        //checking if the user entered is a number,if not terminating the program
        if(!input.hasNextDouble()) {
            System.out.println("invalid number1 Value: "+input.next());
            System.out.println("Terminating the program, Please try again");
            System.exit(0);
        }
        number1 = input.nextDouble();

        //checking if the user entered is a number,if not terminating the program
        System.out.print("Enter second number: ");
        if(!input.hasNextDouble()) {
            System.out.println("invalid number2 Value: " + input.next());
            System.out.println("Terminating the program, Please try again");
            System.exit(0);
        }
        number2 = input.nextDouble();


        //printing a message for user to enter the intended Operation

        System.out.println("For Addition: Press '+'");
        System.out.println("For Subtraction: Press '-'");
        System.out.println("For Multiplication: Press '*'");
        System.out.println("For Division: Press '/'");
        System.out.println();
        System.out.print("Choose an Operator: ");
        operator = input.next().charAt(0);

        //switch statement for Arithematic Operations

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println("Addition of "+number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println("Subtraction of "+ number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println("Multiplication of "+number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                if(number2 ==0 ){
                   System.out.println("outcome of dividing any number by '0' would lead to an 'undefined value'");
                    System.exit(0);
                }
                result = number1 / number2;
                System.out.println("Division of "+ number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator selected or invalid Key pressed, please check and try again!");
                break;

        }
        input.close();
    }
}

