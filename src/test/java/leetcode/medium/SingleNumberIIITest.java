package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIIITest {

    private final SingleNumberIII singleNumberIII;

    SingleNumberIIITest() {
        singleNumberIII = new SingleNumberIII();
    }

    @Test
    void testSingleNumberIII1() {
        int[] nums = {2, 2, 3, 6, 3, 4, 12, 4};
        int[] expected = {6, 12};
        int[] result = singleNumberIII.singleNumberIII(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSingleNumberIII2() {
        int[] nums = {-1, 0};
        int[] expected = {-1, 0};
        int[] result = singleNumberIII.singleNumberIII(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSingleNumberIII3() {
        int[] nums = {0, 1};
        int[] expected = {1, 0};
        int[] result = singleNumberIII.singleNumberIII(nums);

        assertArrayEquals(expected, result);
    }
}