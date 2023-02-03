package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0ToMiddle() {
        int[] input = {1, 2, 3, 4, 6};
        int source = 0;
        int dest = input.length / 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 1, 4, 6};
        Assert.assertArrayEquals(expected, result);
        }

    @Test
    public void whenSwapEndToMiddle() {
        int[] input = {1, 2, 3, 4, 6};
        int source = input.length - 1;
        int dest = input.length / 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 6, 4, 3};
        Assert.assertArrayEquals(expected, result);
    }
}