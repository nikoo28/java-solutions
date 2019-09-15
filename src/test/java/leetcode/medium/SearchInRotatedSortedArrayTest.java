package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2019-09-14 18:43
 */

public class SearchInRotatedSortedArrayTest {

  private SearchInRotatedSortedArray searchInRotatedSortedArray;

  public SearchInRotatedSortedArrayTest() {
    searchInRotatedSortedArray = new SearchInRotatedSortedArray();
  }

  @Test
  public void testSearch() {
    int[] nums = {8, 4, 5, 6, 7};
    assertEquals(1, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4, 5, 6, 7};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4, 5, 6, 7, 1};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{};
    assertEquals(-1, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    assertEquals(4, searchInRotatedSortedArray.search(nums, 0));

    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    assertEquals(-1, searchInRotatedSortedArray.search(nums, 3));

    nums = new int[]{4};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4};
    assertEquals(-1, searchInRotatedSortedArray.search(nums, 0));

    nums = new int[]{5, 1, 3};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 5));

    nums = new int[]{8, 9, 2, 3, 4};
    assertEquals(1, searchInRotatedSortedArray.search(nums, 9));
  }

}
