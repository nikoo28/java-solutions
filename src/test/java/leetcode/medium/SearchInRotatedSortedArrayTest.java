package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

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
    Assert.assertEquals(1, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4, 5, 6, 7};
    Assert.assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4, 5, 6, 7, 1};
    Assert.assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{};
    Assert.assertEquals(-1, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    Assert.assertEquals(4, searchInRotatedSortedArray.search(nums, 0));

    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    Assert.assertEquals(-1, searchInRotatedSortedArray.search(nums, 3));

    nums = new int[]{4};
    Assert.assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

    nums = new int[]{4};
    Assert.assertEquals(-1, searchInRotatedSortedArray.search(nums, 0));

    nums = new int[]{5, 1, 3};
    Assert.assertEquals(0, searchInRotatedSortedArray.search(nums, 5));

    nums = new int[]{8, 9, 2, 3, 4};
    Assert.assertEquals(1, searchInRotatedSortedArray.search(nums, 9));
  }

}
