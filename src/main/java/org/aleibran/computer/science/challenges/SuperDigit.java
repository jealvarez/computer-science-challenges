package org.aleibran.computer.science.challenges;

import java.util.Scanner;

public class SuperDigit {

    public static void main(final String... strings) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please, give the n and k numbers: ");
        final String[] input = scanner.nextLine().split(" ");

        if (input.length < 2)
            return;

        final String n = input[0];
        final int k = Integer.valueOf(input[1]);

        if (!isNumber(n))
            throw new RuntimeException("Just numbers are allowed");

        System.out.println(getSuperDigit(n, k));
    }

    private static int getSuperDigit(final String digits, final int plus) {
        if (digits.length() < 2)
            return Integer.valueOf(digits);

        long sum = 0;
        for (final char number : digits.toCharArray()) {
            sum += Integer.valueOf(String.valueOf(number));
        }
        sum *= plus;

        return getSuperDigit(String.valueOf(sum), 1);
    }

    private static boolean isNumber(final String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}
