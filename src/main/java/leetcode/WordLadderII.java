package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/19/19 2:44 AM
 */

class WordLadderII {

  private List<List<String>> findLadders(String start, String end, List<String> wordList) {

    HashSet<String> dict = new HashSet<>(wordList);
    List<List<String>> res = new ArrayList<>();
    HashMap<String, ArrayList<String>> nodeNeighbors = new HashMap<>();// Neighbors for every node
    HashMap<String, Integer> distance = new HashMap<>();// Distance of every node from the start node
    ArrayList<String> solution = new ArrayList<>();

    dict.add(start);
    bfs(start, end, dict, nodeNeighbors, distance);
    dfs(start, end, nodeNeighbors, distance, solution, res);
    return res;
  }

  // BFS: Trace every node's distance from the start node (level by level).
  private void bfs(String start, String end, Set<String> dict, HashMap<String, ArrayList<String>> nodeNeighbors, HashMap<String, Integer> distance) {
    for (String str : dict)
      nodeNeighbors.put(str, new ArrayList<>());

    Queue<String> queue = new LinkedList<>();
    queue.offer(start);
    distance.put(start, 0);

    while (!queue.isEmpty()) {
      int count = queue.size();
      boolean foundEnd = false;
      for (int i = 0; i < count; i++) {
        String cur = queue.poll();
        int curDistance = distance.get(cur);
        ArrayList<String> neighbors = getNeighbors(cur, dict);

        for (String neighbor : neighbors) {
          nodeNeighbors.get(cur).add(neighbor);
          // Check if visited
          if (!distance.containsKey(neighbor)) {
            distance.put(neighbor, curDistance + 1);
            if (end.equals(neighbor))
              // Found the shortest path
              foundEnd = true;
            else
              queue.offer(neighbor);
          }
        }
      }

      if (foundEnd)
        break;
    }
  }

  // Find all next level nodes.
  private ArrayList<String> getNeighbors(String node, Set<String> dict) {
    ArrayList<String> res = new ArrayList<>();
    char[] chs = node.toCharArray();

    for (char ch = 'a'; ch <= 'z'; ch++) {
      for (int i = 0; i < chs.length; i++) {
        if (chs[i] == ch) continue;
        char old_ch = chs[i];
        chs[i] = ch;
        if (dict.contains(String.valueOf(chs))) {
          res.add(String.valueOf(chs));
        }
        chs[i] = old_ch;
      }

    }
    return res;
  }

  // DFS: output all paths with the shortest distance.
  private void dfs(String cur, String end,
                   HashMap<String, ArrayList<String>> nodeNeighbors,
                   HashMap<String, Integer> distance, ArrayList<String> solution,
                   List<List<String>> res) {

    solution.add(cur);
    if (end.equals(cur)) {
      res.add(new ArrayList<>(solution));
    } else {
      for (String next : nodeNeighbors.get(cur)) {
        if (distance.get(next) == distance.get(cur) + 1) {
          dfs(next, end, nodeNeighbors, distance, solution, res);
        }
      }
    }
    solution.remove(solution.size() - 1);
  }

  public static void main(String[] args) {

    List<String> dict = new ArrayList<>();
    dict.add("ted");
    dict.add("tex");
    dict.add("red");
    dict.add("tax");
    dict.add("tad");
    dict.add("den");
    dict.add("rex");
    dict.add("pee");

    WordLadderII x = new WordLadderII();
    x.findLadders("red", "tax", dict);

  }

}
