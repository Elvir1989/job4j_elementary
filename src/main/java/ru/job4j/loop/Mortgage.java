package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
                amount = (amount + amount * (percent * 0.1)) - salary;
                year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(1000, 1200, 1.0));
    }
}
