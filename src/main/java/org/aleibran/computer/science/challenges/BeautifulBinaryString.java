package org.aleibran.computer.science.challenges;

import java.util.Scanner;

public class BeautifulBinaryString {

    public static void main(final String... strings) {
        final Scanner scanner = new Scanner(System.in);
        final int lengthOfBinatyString = scanner.nextInt();
        final String binaryString = scanner.next();
        final int numberOfSteps = beautifulBinaryString(binaryString);

        System.out.println(numberOfSteps);

        scanner.close();
    }

    private static int beautifulBinaryString(final String binaryString) {
        final String stringToFind = "010";
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = binaryString.indexOf(stringToFind, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += stringToFind.length();
            }
        }

        return count;
    }

}
