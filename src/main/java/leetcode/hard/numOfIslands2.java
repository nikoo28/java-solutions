import java.util.ArrayList;
import java.util.List;

class DSU {
  public List<Integer> parent;
  public List<Integer> size;

  public DSU(int n) {
    parent = new ArrayList<>(n);
    size = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      parent.add(i);
      size.add(1);
    }
  }

  public int find(int a) {
    if (parent.get(a) == a) {
      return a;
    }
    return parent.set(a, find(parent.get(a)));
  }

  public void unionBySize(int u, int v) {
    int parU = find(u), parV = find(v);
    if (parU == parV) {
      return;
    }
    if (size.get(parV) < size.get(parU)) {
      parent.set(parV, parU);
      size.set(parU, size.get(parU) + size.get(parV));
    } else {
      parent.set(parU, parV);
      size.set(parV, size.get(parV) + size.get(parU));
    }
  }
}

class Solution {
  public List<Integer> numOfIslands(int n, int m, List<List<Integer>> ops) {
    DSU d = new DSU(m * n);
    List<List<Integer>> vis = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      vis.add(new ArrayList<>(m));
      for (int j = 0; j < m; j++) {
        vis.get(i).add(0);
      }
    }
    List<Integer> ans = new ArrayList<>();
    int dx[] = {1, -1, 0, 0};
    int dy[] = {0, 0, 1, -1};
    int count = 0;
    for (List<Integer> x : ops) {
      int u = x.get(0), v = x.get(1);
      if (vis.get(u).get(v) == 1) {
        ans.add(count);
        continue;
      }
      count++;
      vis.get(u).set(v, 1);
      for (int i = 0; i < 4; i++) {
        int nx = u + dx[i];
        int ny = v + dy[i];
        if (check(nx, ny, n, m) && vis.get(nx).get(ny) == 1) {
          int roll = u * m + v;
          int Roll = nx * m + ny;
          if (d.find(roll) != d.find(Roll)) {
            d.unionBySize(roll, Roll);
            count--;
          }
        }
      }
      ans.add(count);
    }
    return ans;
  }

public boolean check(int x,int y,int n,int m){
        return (x>=0 && x<n && y>=0 && y<m);
}