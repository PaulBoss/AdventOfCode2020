package net.bosselaar.adventofcode2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Day2Part2 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("./input/day2-1.txt"));

        int validCount = 0;

        for (String line : lines) {
            if (isValidLine(line)) {
                validCount++;
            }
        }

        System.out.println(validCount);
    }

    public static boolean isValidLine(String line) {

        try (Scanner scanner = new Scanner(line)) {
            scanner.useDelimiter("-| |: ");

            int min = scanner.nextInt();
            int max = scanner.nextInt();

            String letter = scanner.next();
            String password = scanner.next();

            int found = 0;
            if (min <= password.length() && password.charAt(min - 1) == letter.charAt(0)) {
                found++;
            }
            if (max <= password.length() && password.charAt(max - 1) == letter.charAt(0)) {
                found++;
            }

            return found == 1;
        }
    }
}
