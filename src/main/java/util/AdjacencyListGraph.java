package util;

import java.util.*;

public class AdjacencyListGraph {

  private Map<Integer, List<Integer>> adjacencyList;

  // Constructor
  public AdjacencyListGraph() {
    this.adjacencyList = new HashMap<>();
  }

  // Add a vertex to the graph
  public void addVertex(int vertex) {
    adjacencyList.put(vertex, new LinkedList<>());
  }

  // Remove a vertex from the graph
  private void removeVertex(int vertex) {
    adjacencyList.remove(vertex);
    // Remove edges pointing to the removed vertex
    for (List<Integer> neighbors : adjacencyList.values()) {
      neighbors.remove((Integer) vertex);
    }
  }

  // Add an edge between two vertices
  public void addEdge(int source, int destination) {
    adjacencyList.get(source).add(destination);
    adjacencyList.get(destination).add(source);
  }

  // Remove an edge between two vertices
  public void removeEdge(int source, int destination) {
    adjacencyList.get(source).remove((Integer) destination);
    adjacencyList.get(destination).remove((Integer) source);
  }

  // Display the adjacency list
  public void printGraph() {
    for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
      System.out.print(entry.getKey() + " -> ");
      for (Integer neighbor : entry.getValue()) {
        System.out.print(neighbor + " ");
      }
      System.out.println();
    }
  }

  public void BFSIterative(int startVertex) {
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();

    queue.add(startVertex);
    visited.add(startVertex);

    // Keep traversing till the queue is empty
    while (!queue.isEmpty()) {

      // Get an element from the queue and mark as visited
      int currentVertex = queue.poll();
      System.out.print(currentVertex + " ");

      // Add all the neighbors to the queue
      for (int neighbor :
          adjacencyList.getOrDefault(currentVertex, Collections.emptyList()))
        if (!visited.contains(neighbor)) {
          queue.add(neighbor);
          visited.add(neighbor);
        }
    }
  }

  public void DFSIterative(int startVertex) {
    Set<Integer> visited = new HashSet<>();
    Stack<Integer> stack = new Stack<>();

    stack.push(startVertex);

    // Keep traversing until stack is empty
    while (!stack.isEmpty()) {

      int currentVertex = stack.pop();

      // Get an element from stack and mark as visited
      // if we haven't visited it already
      if (!visited.contains(currentVertex)) {
        System.out.print(currentVertex + " ");
        visited.add(currentVertex);

        // Add all the unvisited neighbors to stack
        for (int neighbor :
            adjacencyList.getOrDefault(currentVertex, Collections.emptyList()))
          if (!visited.contains(neighbor))
            stack.push(neighbor);
      }
    }
  }

  public void DFS(int startVertex) {
    Set<Integer> visited = new HashSet<>();
    DFSRecursive(startVertex, visited);
  }

  private void DFSRecursive(int vertex, Set<Integer> visited) {

    // Add the vertex to visited set
    visited.add(vertex);
    System.out.print(vertex + " ");

    // Iterate through each neighbor of the vertex
    for (int neighbor :
        adjacencyList.getOrDefault(vertex, Collections.emptyList()))

      // If not visited, perform dfs on the vertex
      if (!visited.contains(neighbor))
        DFSRecursive(neighbor, visited);

  }

  public static void main(String[] args) {
    AdjacencyListGraph graph = new AdjacencyListGraph();

    // Adding vertices
    graph.addVertex(1);
    graph.addVertex(2);
    graph.addVertex(3);

    // Adding edges
    graph.addEdge(1, 2);
    graph.addEdge(2, 3);
    graph.addEdge(3, 1);

    // Displaying the graph
    System.out.println("Graph after adding vertices and edges:");
    graph.printGraph();

    // Removing vertex 2
    graph.removeVertex(2);
    graph.removeVertex(1);
    System.out.println("\nGraph after removing vertex 2:");
    graph.printGraph();

    // Removing edge (3, 1)
    graph.removeEdge(3, 1);
    System.out.println("\nGraph after removing edge (3, 1):");
    graph.printGraph();
  }

}
