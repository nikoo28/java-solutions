package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

  private final ProductOfArrayExceptSelf productOfArrayExceptSelf;

  ProductOfArrayExceptSelfTest() {
    productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
  }

  @Test
  void testProductExceptSelf1() {
    int[] nums = {1, 2, 3, 4};

    int[] expected = {24, 12, 8, 6};

    int[] actual = productOfArrayExceptSelf.productExceptSelf(nums);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testProductExceptSelf2() {
    int[] nums = {-1, 1, 0, -3, 3};

    int[] expected = {0, 0, 9, 0, 0};

    int[] actual = productOfArrayExceptSelf.productExceptSelf(nums);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testProductExceptSelf3() {
    int[] nums = {0, 0};

    int[] expected = {0, 0};

    int[] actual = productOfArrayExceptSelf.productExceptSelf(nums);
    assertArrayEquals(expected, actual);
  }
}