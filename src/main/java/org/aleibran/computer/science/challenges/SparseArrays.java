package org.aleibran.computer.science.challenges;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SparseArrays {

    public static void main(final String... arguments) throws Exception {
        final List<String> inputAsArray = readFromFile();
        // final List<String> inputAsArray = readFromSystemIn();

        final Supplier<Stream<String>> fileSupplier = () -> inputAsArray.stream();

        final int noStrings = Integer.valueOf(inputAsArray.get(0));
        final Supplier<Stream<String>> stringsSupplier = () -> fileSupplier.get().skip(1).limit(noStrings);

        final int noQueries = Integer.valueOf(inputAsArray.get(0)) + 2;
        final Supplier<Stream<String>> queriesSupplier = () -> fileSupplier.get().skip(noQueries).limit(Integer.valueOf(inputAsArray.get(noQueries - 1)));

        queriesSupplier.get().forEach((q) -> {
            System.out.println(stringsSupplier.get().filter((s) -> s.equals(q)).count());
        });
    }

    private static List<String> readFromFile() throws Exception {
        final String fileName = "input/sparse-arrays.txt";

        final ClassLoader classLoader = SparseArrays.class.getClassLoader();
        final File file = new File(classLoader.getResource(fileName).getFile());

        return Files.readAllLines(file.toPath());
    }

    private static List<String> readFromSystemIn() {
        final Scanner scanner = new Scanner(System.in);
        final List<String> strings = new ArrayList<>();

        while (scanner.hasNext()) {
            strings.add(scanner.nextLine());
        }

        return strings;
    }

}
