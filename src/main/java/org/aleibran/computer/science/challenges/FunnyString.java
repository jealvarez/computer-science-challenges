package org.aleibran.computer.science.challenges;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunnyString {

    public static void main(final String... arguments) throws Exception {
        final List<String> inputAsArray = readFromFile();

        final int noStrings = Integer.valueOf(inputAsArray.get(0));
        final List<String> strings = inputAsArray.stream().skip(1).limit(noStrings).collect(Collectors.toList());

        System.out.println(Arrays.asList(getFunnyString(noStrings, strings)));
    }

    private static List<String> getFunnyString(final int capacity, final List<String> strings) {
        final List<String> funnyStringResponse = new ArrayList<>(capacity);
        for (final String string : strings) {
            funnyStringResponse.add(isFunnyString(string) ? "Funny" : "Not Funny");
        }
        return funnyStringResponse;
    }

    private static boolean isFunnyString(final String string) {
        boolean funnyString = false;
        final char[] chars = string.toCharArray();
        for (int n = 1; n < chars.length; n++) {
            final int fromLower = Math.abs(string.charAt(n) - string.charAt(n - 1));
            final int fromUpper = Math.abs(string.charAt(chars.length - (1 + n)) - string.charAt(chars.length - n));
            if (fromLower != fromUpper) {
                funnyString = false;
                break;
            }

            funnyString = true;
        }
        return funnyString;
    }

    private static List<String> readFromFile() throws Exception {
        final String fileName = "input/funny-string.txt";

        final ClassLoader classLoader = FunnyString.class.getClassLoader();
        final File file = new File(classLoader.getResource(fileName).getFile());

        return Files.readAllLines(file.toPath());
    }

}
