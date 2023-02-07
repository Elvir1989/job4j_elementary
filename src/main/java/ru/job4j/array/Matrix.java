package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {

        int[][] array = new int[size][size];
        int result;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                result = i * j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        return array;
    }
}
