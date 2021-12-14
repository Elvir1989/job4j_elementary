package ru.job4j.condition;

public class SqArea {

    @SuppressWarnings("checkstyle:LocalVariableName")
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 1, S = " + result1);
    }
}
