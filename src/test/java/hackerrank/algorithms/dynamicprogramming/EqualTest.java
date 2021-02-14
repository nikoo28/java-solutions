package hackerrank.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2/14/21 12:48 AM
 */

class EqualTest {

  private final Equal equal;

  public EqualTest() {
    equal = new Equal();
  }

  @Test
  void testEqual1() {
    int[] arr = {1, 1, 5};

    assertEquals(2, equal.equal(arr));
  }

  @Test
  void testEqual2() {
    int[] arr = {2, 2, 3, 7};

    assertEquals(2, equal.equal(arr));
  }

  @Test
  void testEqual3() {
    int[] arr = {10, 7, 12};

    assertEquals(3, equal.equal(arr));
  }

  @Test
  void testEqual4() {
    int[] arr = {520, 862, 10, 956, 498, 956, 991, 542, 523, 664, 378, 194, 76, 90, 753, 868, 837, 830, 932, 814, 616,
        78, 103, 882, 452, 397, 899, 488, 149, 108, 723, 22, 323, 733, 330, 821, 41, 322, 715, 917, 986, 93, 111, 63,
        535, 864, 931, 372, 47, 215, 539, 15, 294, 642, 897, 98, 391, 796, 939, 540, 257, 662, 562, 580, 747, 893,
        401, 789, 215, 468, 58, 553, 561, 169, 616, 448, 385, 900, 173, 432, 115, 712};

    assertEquals(8198, equal.equal(arr));
  }

  @Test
  void testEqual5() {
    int[] arr = {53, 361, 188, 665, 786, 898, 447, 562, 272, 123, 229, 629, 670, 848, 994, 54, 822, 46, 208, 17, 449,
        302, 466, 832, 931, 778, 156, 39, 31, 777, 749, 436, 138, 289, 453, 276, 539, 901, 839, 811, 24, 420, 440, 46,
        269, 786, 101, 443, 832, 661, 460, 281, 964, 278, 465, 247, 408, 622, 638, 440, 751, 739, 876, 889, 380, 330,
        517, 919, 583, 356, 83, 959, 129, 875, 5, 750, 662, 106, 193, 494, 120, 653, 128, 84, 283, 593, 683, 44, 567,
        321, 484, 318, 412, 712, 559, 792, 394, 77, 711, 977, 785, 146, 936, 914, 22, 942, 664, 36, 400, 857};

    assertEquals(10605, equal.equal(arr));
  }
}