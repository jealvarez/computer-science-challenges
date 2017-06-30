package org.aleibran.computer.science.challenges;

import java.util.Scanner;
import java.util.stream.Stream;

public class MarsExploration {

    public static void main(final String... arguments) throws Exception {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please, give the string: ");

        final String line = scanner.nextLine();

        final String[] strings = line.split("(?<=\\G...)");

        System.out.println(Stream.of(strings).filter((s) -> !"SOS".equals(s))
                                   .mapToInt((c) -> {
                                       int count = (Character.compare('S', c.charAt(0)) != 0) ? 1 : 0;
                                       count += (Character.compare('O', c.charAt(1)) != 0) ? 1 : 0;
                                       count += (Character.compare('S', c.charAt(2)) != 0) ? 1 : 0;
                                       return count;
                                   }).asLongStream().sum());
    }

}
