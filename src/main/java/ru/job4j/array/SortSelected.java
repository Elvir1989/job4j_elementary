package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); //этот метод нужен для получения минимального элемента в массиве.
            int index = FindLoop.indexInRange(data, min, i, data.length - 1); //этот метод нужен, чтобы получить индекс элемента, полученного из метода MinDiapason.findMin.
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}

