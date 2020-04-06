package leetcode.hard;

/**
 * Created by nikoo28 on 11/2/19 4:39 PM
 */

class TrappingRainWaterII {

  int trapRainWater(int[][] heightMap) {

    if (heightMap.length == 0)
      return 0;

    // Go Row by Row
    int[][] levelMaxRowise = new int[heightMap.length][heightMap[0].length];
    for (int row = 1; row < heightMap.length - 1; row++) {

      int max = Integer.MIN_VALUE;
      int[] leftMax = new int[heightMap[0].length];
      for (int col = 0; col < heightMap[row].length; col++) {
        if (max < heightMap[row][col]) max = heightMap[row][col];

        leftMax[col] = max;
      }

      max = Integer.MIN_VALUE;
      int[] rightMax = new int[heightMap[0].length];
      for (int col = heightMap[0].length - 1; col >= 0; col--) {
        if (max < heightMap[row][col]) max = heightMap[row][col];

        rightMax[col] = max;
      }

      for (int col = 0; col < heightMap[0].length; col++) {
        levelMaxRowise[row][col] = Math.min(leftMax[col], rightMax[col]) - heightMap[row][col];
      }
    }

    // Go Column by Column
    int[][] levelMaxColumnwise = new int[heightMap.length][heightMap[0].length];
    for (int col = 1; col < heightMap[0].length - 1; col++) {

      int max = Integer.MIN_VALUE;
      int[] topMax = new int[heightMap.length];
      for (int row = 0; row < heightMap.length; row++) {
        if (max < heightMap[row][col]) max = heightMap[row][col];

        topMax[row] = max;
      }

      max = Integer.MIN_VALUE;
      int[] bottomMax = new int[heightMap.length];
      for (int row = heightMap.length - 1; row > -1; row--) {
        if (max < heightMap[row][col]) max = heightMap[row][col];

        bottomMax[row] = max;
      }

      for (int row = 0; row < heightMap.length; row++) {
        levelMaxColumnwise[row][col] = Math.min(topMax[row], bottomMax[row]) - heightMap[row][col];
      }
    }

    int[][] myWetMap = new int[heightMap.length][heightMap[0].length];
    int sum = 0;
    for (int i = 0; i < heightMap.length; i++) {
      for (int j = 0; j < heightMap[0].length; j++) {
        myWetMap[i][j] = Math.max(levelMaxRowise[i][j], levelMaxColumnwise[i][j]);
        sum += myWetMap[i][j];
      }
    }

    boolean spillWater = true;
    int[] rowOffset = {-1, 1, 0, 0};
    int[] colOffset = {0, 0, 1, -1};
    while (spillWater) {
      spillWater = false;
      for (int i = 1; i < heightMap.length - 1; i++) {
        for (int j = 1; j < heightMap[0].length - 1; j++) {
          /*If this slot has ever gotten wet, exammine its 4 neightbors*/
          if (myWetMap[i][j] != 0) {
            for (int m = 0; m < 4; m++) {
              int neighborRow = i + rowOffset[m];
              int neighborCol = j + colOffset[m];
              int currentHeight = myWetMap[i][j] + heightMap[i][j];
              int neighborHeight = myWetMap[neighborRow][neighborCol] +
                  heightMap[neighborRow][neighborCol];
              if (currentHeight > neighborHeight) {
                int spilledWater = currentHeight - Math.max(neighborHeight, heightMap[i][j]);
                myWetMap[i][j] = Math.max(0, myWetMap[i][j] - spilledWater);
                sum -= spilledWater;
                spillWater = true;
              }
            }
          }
        }
      }
    }
    return sum;
  }
}
