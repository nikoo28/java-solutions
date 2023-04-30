package leetcode.medium;

public class MaximumProductSubarray {

  int maxProduct(int[] nums) {

    int n = nums.length;
    int leftProduct = 1;
    int rightProduct = 1;
    int ans = nums[0];

    for (int i = 0; i < n; i++) {

      //if any of leftProduct or rightProduct become 0 then update it to 1
      leftProduct = leftProduct == 0 ? 1 : leftProduct;
      rightProduct = rightProduct == 0 ? 1 : rightProduct;

      //prefix product
      leftProduct *= nums[i];

      //suffix product
      rightProduct *= nums[n - 1 - i];

      ans = Math.max(ans, Math.max(leftProduct, rightProduct));
    }

    return ans;
  }

}
