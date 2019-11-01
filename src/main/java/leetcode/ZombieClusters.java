package leetcode;

/**
 * Created by nikoo28 on 12/18/17 3:25 PM
 */

class ZombieClusters {

  private int zombieClusterDFS(String[] zombies) {

    int N = zombies[0].length();

    int[][] M = new int[N][N];
    char[][] grid = new char[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        M[i][j] = Integer.parseInt(zombies[i].charAt(j) + "");
        grid[i][j] = zombies[i].charAt(j);
      }
    }

    System.out.println("UNION FIND = " + numIslands(grid));
    return findClustersDFS(M, N);
  }

  private int[][] distance = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  private int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
      return 0;
    }
    UnionFind uf = new UnionFind(grid);
    int rows = grid.length;
    int cols = grid[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == '1') {
          for (int[] d : distance) {
            int x = i + d[0];
            int y = j + d[1];
            if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == '1') {
              int id1 = i * cols + j;
              int id2 = x * cols + y;
              uf.union(id1, id2);
            }
          }
        }
      }
    }
    return uf.count;
  }

  private static int findClustersDFS(int[][] M, int N) {

    boolean[] visited = new boolean[N];

    int count = 0;
    for (int i = 0; i < N; ++i) {
      if (!visited[i]) {
        DFS(M, N, visited, i);
        visited[i] = true;
        count++;
      }
    }
    return count;
  }

  private static void DFS(int[][] M, int N, boolean[] visited, int s) {

    if (!visited[s]) {

      for (int j = s + 1; j < N; j++) {

        if (M[s][j] == 1 && !visited[j]) {
          DFS(M, N, visited, j);
          visited[j] = true;
        }
      }
    }
  }

  public static void main(String[] args) {

//    String[] zombies = {"1100", "0110", "0010", "0001"};
//    String[] zombies = {"100001", "010001", "001001", "000101", "000011", "000001"};
    String[] zombies = {"110000", "110000", "001000", "000110", "100000", "000000"};
    System.out.println(new ZombieClusters().zombieClusterDFS(zombies));
  }

}
