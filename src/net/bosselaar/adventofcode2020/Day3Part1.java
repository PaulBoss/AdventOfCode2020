package net.bosselaar.adventofcode2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day3Part1 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("./input/day3-1.txt"));

        part1(lines);
    }

    public static void part1(List<String> lines) {
        int width = lines.get(0).trim().length();
        int height = lines.size();

        char[][] map = new char[width][height];

        for (int y = 0; y < height; y++) {
            String line = lines.get(y);
            for (int x = 0; x < width; x++) {
                map[x][y] = line.charAt(x);
            }
        }


        int x = 0;
        int y = 0;
        int count = 0;

        while (y < height) {
            if (map[x][y] == '#') {
                count++;
            }

            x = (x + 3) % width;
            y = y + 1;
        }

        System.out.print(count);
    }


}
