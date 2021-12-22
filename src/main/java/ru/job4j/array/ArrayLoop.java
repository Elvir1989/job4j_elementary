package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = index * 2 * 3;
        }
        for (int index = 0; index < arrays.length; index++) {
            System.out.println(arrays[index]);
        }
    }
}
