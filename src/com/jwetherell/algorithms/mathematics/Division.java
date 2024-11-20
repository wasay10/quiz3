package com.jwetherell.algorithms.mathematics;

public class Division {

    public static final long division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return ((long) a) / ((long) b);
    }

    public static final long divisionUsingLoop(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long temp = absA;
        long result = 0;
        while (temp >= absB) {
            temp -= absB;
            result++;
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingRecursion(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        if (absA < absB) {
            return 0;
        }
        return (a > 0 && b > 0 || a < 0 && b < 0)
                ? 1 + divisionUsingRecursion(absA - absB, absB)
                : -1 - divisionUsingRecursion(absA - absB, absB);
    }

    public static final long divisionUsingMultiplication(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 0;
        while (absA >= absB) {
            int tempB = absB, multiplier = 1;
            while (absA >= (tempB << 1)) {
                tempB <<= 1;
                multiplier <<= 1;
            }
            absA -= tempB;
            result += multiplier;
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingLogs(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        long absA = Math.abs(a);
        long absB = Math.abs(b);
        long result = (long) (Math.exp(Math.log(absA) - Math.log(absB)));
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }
}
