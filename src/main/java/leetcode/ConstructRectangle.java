package leetcode;

/**
 * Created by nikoo28 on 12/17/17 3:23 AM
 */

class ConstructRectangle {

  public int[] constructRectangle(int area) {

    int w = (int) Math.sqrt(area);
    while (area % w != 0) w--;
    return new int[]{area / w, w};

  }

}
