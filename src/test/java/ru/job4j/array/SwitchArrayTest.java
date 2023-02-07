package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0ToMiddle() {
        int[] input = {1, 2, 3, 7, 4, 6, 8};
        int source = 0;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 2, 3, 1, 4, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwapEndToMiddle() {
        int[] input = {1, 2, 3, 4, 6, 10};
        int source = input.length - 1;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 10, 6, 4};
        assertThat(result).containsExactly(expected);
    }

}