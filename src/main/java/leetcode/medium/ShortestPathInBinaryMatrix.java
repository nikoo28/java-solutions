package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

  int shortestPathBinaryMatrix(int[][] grid) {
    int n = grid.length;

    if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0)
      return -1;

    int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    Queue<int[]> queue = new LinkedList<>();

    queue.offer(new int[]{0, 0, 1}); // row, col, path length

    boolean[][] visited = new boolean[n][n];
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      int r = curr[0], c = curr[1], len = curr[2];
      if (r == n - 1 && c == n - 1) return len;
      for (int[] d : dirs) {
        int nr = r + d[0], nc = c + d[1];
        if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0 && !visited[nr][nc]) {
          queue.offer(new int[]{nr, nc, len + 1});
          visited[nr][nc] = true;
        }
      }
    }

    return -1;
  }

}
