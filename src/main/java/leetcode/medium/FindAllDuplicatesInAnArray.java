package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by nikoo28 on 2/6/21 6:50 PM
 */

public class FindAllDuplicatesInAnArray {

  public List<Integer> findDuplicatesConstantSpace(int[] nums) {

    List<Integer> resultSet = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // Get the index, the element corresponds to
      int index = Math.abs(nums[i]) - 1;

      // If the number is already negative, it means we are 
      // encountering it twice
      if (nums[index] < 0)
        resultSet.add(index + 1);

      // Flip the number at the index to negative
      nums[index] = nums[index] * -1;
    }

    return resultSet;
  }

  public List<Integer> findDuplicatesLinearSpace(int[] nums) {

    List<Integer> resultSet = new ArrayList<>();

    // Set to store unique numbers
    Set<Integer> uniqueSet = new HashSet<>();
    for (int num : nums) {

      // If already present, then it is a duplicate
      if (uniqueSet.contains(num))
        resultSet.add(num);

      // Add the number to the set
      uniqueSet.add(num);
    }

    return resultSet;
  }

}
