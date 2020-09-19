package com.company;

public class Main {

    public static void main(String[] argsOriginal) {
        try {
            String consoleLine = "-1.5 - 1e-2";
            //String consoleLine = "-1.5 + 1e-2";
            //String consoleLine = "-1.5 * 1e-2";
            //String consoleLine = "-1.5 / 1e-2";

            //You stupid. It's fail
            //String consoleLine = "-1.5 / 1e-13";
            String[] args = consoleLine.split(" ");
            double x = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double y = Double.parseDouble(args[2]);
            if (operation == '/' && y > -1e-12 || operation == '/' && y < 1e-12) {
                throw new IllegalArgumentException("You stupid. It's fail");
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
