package javaAssignment;

import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next();
                choice = -1;
            }

            switch (choice) {
                case 1:
                    printNumbersDescending();
                    break;
                case 2:
                    printEvenOrOdd();
                    break;
                case 3:
                    int number = readInteger(scanner, "Enter a number: ");
                    System.out.println(checkNumberType(number));
                    break;
                case 4:
                    int firstNumber = readInteger(scanner, "Enter the first number: ");
                    int secondNumber = readInteger(scanner, "Enter the second number: ");
                    int sum = calculateSum(firstNumber, secondNumber);
                    System.out.println("Sum = " + sum);
                    break;
                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("Number Analyzer Menu");
        System.out.println("=========================");
        System.out.println("1 - Print Numbers 10 to 1");
        System.out.println("2 - Print Even/Odd Report");
        System.out.println("3 - Check Number Type");
        System.out.println("4 - Calculate Sum Between Two Numbers");
        System.out.println("5 - Exit");
        System.out.println("=========================");
    }

    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    public static int readInteger(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
