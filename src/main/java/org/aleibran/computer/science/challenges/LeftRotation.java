package org.aleibran.computer.science.challenges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeftRotation {

    public static void main(final String... strings) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please, give the n and d numbers: ");
        final String[] numbers = scanner.nextLine().split(" ");

        System.out.println("Please, give the array numbers: ");
        final List<String> array = new LinkedList<String>(Arrays.asList(scanner.nextLine().split(" ")));

        System.out.println(rotate(array, Integer.valueOf(numbers[0]), Integer.valueOf(numbers[1])).stream().map(Object::toString)
                                              .collect(Collectors.joining(" ")));
    }

    private static List<String> rotate(List<String> array, final int arraySize, final int noRotations) {
        for (int i = 0; i < noRotations; i++) {
            final String head = array.get(0);
            array.remove(0);
            array.add(head);
        }
        return array;
    }

}
