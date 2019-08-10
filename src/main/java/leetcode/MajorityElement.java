package leetcode;

import java.util.Arrays;

/**
 * Created by nikoo28 on 12/17/17 3:14 PM
 */

public class MajorityElement {

  public int majorityElement(int[] nums) {

    Arrays.sort(nums);
    return nums[nums.length / 2];

  }

  public static void main(String[] args) {

    int[] num = {1, 2, 3, 4};
    System.out.println(new MajorityElement().majorityElement(num));

  }

}
