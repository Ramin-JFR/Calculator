package org.example.calculator;


public class CalculatorApplication {
    public CalculatorApplication() {

    }

    public double add(double a, double b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    double squareRoot(double a) {
        if (a < 0) {
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    double power(int a, int b) {

        double answer = a;

        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;

        } else {

            for (int x = 2; x <= Math.abs(b); x++) {
                answer *= a;
            }

            if (b < 0) {
                return 1 / answer;
            }

        }
        return answer;
    }

    public double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double abs(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    double factorial(double a) {

        if (a == 0) {
            return 1; // The factorial of 0 is 1
        } else {
            return a * factorial(a - 1); // Recursive call
        }
    }


    double log(int a, int b) {
        if (a > 0 && a != 1 && b > 0 && b != 1) {
            return Math.log(a) / Math.log(b);
        } else return 0;
    }


}