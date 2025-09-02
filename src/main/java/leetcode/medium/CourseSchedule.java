package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

  // evaluate using BFS
  boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> graph = new ArrayList<>();
    int[] inDegree = new int[numCourses];
    for (int i = 0; i < numCourses; i++)
      graph.add(new ArrayList<>());


    for (int[] pre : prerequisites) {
      graph.get(pre[1]).add(pre[0]);
      inDegree[pre[0]]++;
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < numCourses; i++)
      if (inDegree[i] == 0)
        queue.offer(i);

    int count = 0;
    while (!queue.isEmpty()) {
      int curr = queue.poll();
      count++;
      for (int next : graph.get(curr)) {
        inDegree[next]--;
        if (inDegree[next] == 0) queue.offer(next);
      }
    }
    return count == numCourses;
  }

}
