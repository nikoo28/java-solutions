package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nikoo28 on 2019-09-14 15:26
 */

class KClosestPointsToOrigin {

  private int[][] kClosest(int[][] points, int K) {

    Map<Integer, List<String>> distancePointMap = new TreeMap<>();
    int[][] result = new int[K][2];

    for (int[] point : points) {
      int distanceFromOrigin = (int) (Math.pow(point[0], 2) + Math.pow(point[1], 2));
      String p = String.format("%d,%d", point[0], point[1]);

      List<String> pointList = distancePointMap.getOrDefault(distanceFromOrigin, new ArrayList<>());
      pointList.add(p);

      distancePointMap.put(distanceFromOrigin, pointList);
    }

    int idx = 0;
    ab:
    for (Map.Entry<Integer, List<String>> distancePointList : distancePointMap.entrySet()) {
      for (String point : distancePointList.getValue()) {
        result[idx][0] = Integer.parseInt(point.split(",")[0]);
        result[idx][1] = Integer.parseInt(point.split(",")[1]);

        idx++;
        if (idx == K)
          break ab;
      }
    }

    return result;
  }

  public static void main(String[] args) {

    KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();

//    int[][] point = {{1,3},{-2,2}};
    int[][] point = {{0, 1}, {1, 0}};
//    int[][] point = {{3, 3}, {5, -1}, {-2, 4}};
    kClosestPointsToOrigin.kClosest(point, 2);
  }

}
