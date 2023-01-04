import java.util.*;
import java.lang.*;
import java.io.*;

class numOfIslands2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

class DisjointSet{
    int[] parent;
    int[] size;
    
    public DisjointSet(int n){
        parent = new int[n];
        size = new int[n];
        
        for(int i=0; i<n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    
    public int findUPar(int u){
        if(parent[u] == u) return u;
        return parent[u] = findUPar(parent[u]);
    }
    
    public void unionBySize(int u, int v){
        int uPar = findUPar(u), vPar = findUPar(v);
        if(uPar == vPar) return;
        if(size[uPar] > size[vPar]){
            parent[vPar] = parent[uPar];
            size[uPar] += size[vPar];
        } else {
            parent[uPar] = parent[vPar];
            size[vPar] += size[uPar];
        }
    }
}

class Solution {
    
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        DisjointSet ds = new DisjointSet(rows*cols);
        List<Integer> ans = new ArrayList<>();
        
        int[][] visited = new int[rows][cols];
        
        int[] rDelta = new int[]{0,0,1,-1};
        int[] cDelta = new int[]{1,-1,0,0};
        
        int islands = 0;
        
        for(int[] operator : operators){
            int r = operator[0], c = operator[1];
            if(visited[r][c] != 1){
                visited[r][c] = 1;
                islands++;
                
                for(int i=0; i<4; i++){
                    int u = r + rDelta[i], v = c + cDelta[i];
                    
                    if(u>=0 && u<rows && v>=0 && v<cols && visited[u][v]==1){
                        if(ds.findUPar(u*cols + v) != ds.findUPar(r*cols + c)){
                            islands--;
                            ds.unionBySize(u*cols + v, r*cols + c);
                        }
                    }
                }
            }
            ans.add(islands);
        }
        
        return ans;
    }
    
}
