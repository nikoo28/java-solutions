package util;

/**
 * Created by nikoo28 on 1/17/21 4:44 PM
 */

public class LinearSearch {

  public static boolean linearSearch(int[] arr, int numberToSearch) {

    boolean found = false;

    // Search sequentially through each element
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == numberToSearch) {
        found = true;
        break;
      }

    }

    return found;
  }

  public static boolean sortedLinearSearch(int[] arr, int numberToSearch) {

    boolean found = false;

    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == numberToSearch)
        found = true;

      // If arr[i] is greater than the numberToSearch, we can simply exit
      // as we would not be able to find the number further
      if (arr[i] > numberToSearch)
        break;
    }

    return found;
  }

}
