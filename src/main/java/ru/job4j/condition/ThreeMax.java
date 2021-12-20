package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second && third > second) {
            result = first;
        }
        if (second > first && third > first) {
            result = second;
        }
        return result;
    }
}
