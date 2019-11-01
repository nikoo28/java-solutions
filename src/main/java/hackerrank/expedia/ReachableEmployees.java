package hackerrank.expedia;

import java.util.*;

/**
 * Created by nikoo28 on 2019-08-25 22:04
 */

class ReachableEmployees {
  private static void bfs(int i, boolean[] visited, ArrayList<Integer>[] graph, int[][] bfs_res) {

    visited[i] = true;
    Queue<Integer> q = new LinkedList<>();
    q.add(i);

    while (!q.isEmpty()) {
      Integer current = q.poll();

      for (int k = 0; k < graph[current].size(); k++) {
        int new_i = graph[current].get(k);

        if (!visited[new_i]) {
          visited[new_i] = true;
          bfs_res[new_i][1] = bfs_res[current][1] + 1;
          q.add(new_i);
        }
      }
    }

  }

  private static List<Integer> order(int employeeNodes, List<Integer> employeesFrom, List<Integer> employeesTo, int host) {

    List<Integer> res = new ArrayList<>();

    int[][] bfs_res = new int[employeeNodes + 1][2];

    ArrayList<Integer>[] graph = new ArrayList[employeeNodes + 1];

    for (int i = 0; i < employeeNodes + 1; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i = 0; i < employeesFrom.size(); i++) {
      int src = employeesFrom.get(i);
      int dest = employeesTo.get(i);
      graph[src].add(dest);
      graph[dest].add(src);
    }
    bfs_res[0][0] = 0;
    bfs_res[0][1] = -1;
    for (int i = 0; i < employeeNodes + 1; i++) {
      bfs_res[i][0] = i;
      bfs_res[i][1] = 0;
    }
    bfs_res[host][1] = 0;
    boolean[] visited = new boolean[employeeNodes + 1];
    bfs(host, visited, graph, bfs_res);

    Arrays.sort(bfs_res, (entry1, entry2) -> {
      if (entry1[1] > entry2[1])
        return 1;
      else {
        if (entry1[1] == entry2[1]) {
          {
            if (entry1[0] < entry2[0])
              return -1;
            else return 1;
          }
        } else return -1;
      }

    });

    for (int i = 0; i < employeeNodes + 1; i++) {
      if (i == 0 || bfs_res[i][0] == host)
        continue;
      res.add(bfs_res[i][0]);

    }
    return res;
  }

  public static void main(String[] args) {
    int employeeNodes = 2;
    List<Integer> employeesFrom = Arrays.asList(2, 1);
    List<Integer> employeesTo = Arrays.asList(1, 2);
    int host = 2;
    System.out.println(order(employeeNodes, employeesFrom, employeesTo, host));
  }
}