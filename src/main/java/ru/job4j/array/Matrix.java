package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        int result = 0;
        for (int i = 1; i < array.length + 1; i++) {
            for (int j = 1; j < array.length + 1; j++) {
                result = i * j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        return array;
    }

}
