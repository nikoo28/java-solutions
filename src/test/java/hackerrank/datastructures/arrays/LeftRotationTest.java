package hackerrank.datastructures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 9/2/20 12:17 AM
 */

class LeftRotationTest {

  LeftRotation leftRotation = new LeftRotation();

  @Test
  void rotateLeft1() {
    int arr[] = {1, 2, 3, 4, 5};
    int rotation = 2;
    int result[] = {3, 4, 5, 1, 2};

    leftRotation.rotateLeftUsingReverse(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1, 2, 3, 4, 5};
    leftRotation.rotateLeftUsingBruteForce(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1, 2, 3, 4, 5};
    leftRotation.rotateLeft(arr, rotation);
    assertArrayEquals(result, arr);
  }

  @Test
  void rotateLeft2() {
    int arr[] = {1, 2, 3, 4, 5};
    int rotation = 22;
    int result[] = {3, 4, 5, 1, 2};

    leftRotation.rotateLeftUsingReverse(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1, 2, 3, 4, 5};
    leftRotation.rotateLeftUsingBruteForce(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1, 2, 3, 4, 5};
    leftRotation.rotateLeft(arr, rotation);
    assertArrayEquals(result, arr);
  }

  @Test
  void rotateLeft3() {
    int arr[] = {1};
    int rotation = 22;
    int result[] = {1};

    leftRotation.rotateLeftUsingReverse(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1};
    leftRotation.rotateLeftUsingBruteForce(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1};
    leftRotation.rotateLeft(arr, rotation);
    assertArrayEquals(result, arr);
  }

  @Test
  void rotateLeft4() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int rotation = 2;
    int[] result = {3, 4, 5, 6, 7, 1, 2};
    leftRotation.rotateLeftUsingReverse(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    leftRotation.rotateLeftUsingBruteForce(arr, rotation);
    assertArrayEquals(result, arr);

    arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    leftRotation.rotateLeft(arr, rotation);
    assertArrayEquals(result, arr);
  }
}