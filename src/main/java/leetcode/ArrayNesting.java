package leetcode;

/**
 * Created by nikoo28 on 6/3/19 1:43 AM
 */

class ArrayNesting {

  private int findSetS(int[] nums) {
    boolean[] visited = new boolean[nums.length];
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      if (!visited[i]) {
        int start = nums[i], count = 0;
        do {
          start = nums[start];
          count++;
          visited[start] = true;
        } while (start != nums[i]);
        res = Math.max(res, count);
      }
    }
    return res;
  }

  public static void main(String[] args) {

    ArrayNesting arrayNesting = new ArrayNesting();

    int[] arr = new int[]{5, 4, 0, 3, 1, 6, 2};
    System.out.println(arrayNesting.findSetS(arr));
  }

}
