package com.company;

public class Calc {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Incorrect arguments length");
            return;
        }
        try {
            double x = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double y = Double.parseDouble(args[2]);
            if (operation == '/' && y > -1e-12 && y < 1e-12) {
                System.out.println("Division by zero");
                return;
            }
            System.out.println(calc(x, y, operation));
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format");
        }
    }

    private static double calc(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                return Double.NaN;
        }

    }
}
