package ru.job4j.caculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) { // метод скаладвает результаты двух методов
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumTwoMethods(double first, double second) { // метод складвает результаты двух методов
        return difference(first, second) + division(first, second);
    }

    public static double subtractionFourMethods(double first, double second) { // метод расчитываем сумму вычислеия всех четырех методов
        return sum(first, second) - multiply(first, second) - difference(first, second) - division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));

    }
}