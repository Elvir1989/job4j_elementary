package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoop01Test {
    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop01.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop01.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5() {
        int[] data = new int[] {12, 4, 12, 28, 15, 7, 9};
        int el = 7;
        int start = 2;
        int finish = 6;
        int result = FindLoop01.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind31() {
        int[] data = new int[] {3, 4, 7, 10, 5};
        int el = 10;
        int start = 2;
        int finish = 3;
        int result = FindLoop01.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}