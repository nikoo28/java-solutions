package util;

import java.util.*;

public class WeightedGraph {

  private int vertices;
  private List<GraphEdge>[] adjacencyList;

  public WeightedGraph(int vertices) {
    this.vertices = vertices;
    adjacencyList = new ArrayList[vertices];

    for (int i = 0; i < vertices; i++)
      adjacencyList[i] = new ArrayList<>();
  }

  public void addDirectedEdge(int source, int destination, int weight) {
    GraphEdge edge = new GraphEdge(source, destination, weight);

    adjacencyList[source].add(edge);
  }

  public void addUndirectedEdge(int source, int destination, int weight) {
    GraphEdge sourceToDestinationEdge = new GraphEdge(source, destination, weight);
    GraphEdge destinationToSourceEdge = new GraphEdge(destination, source, weight);

    adjacencyList[source].add(sourceToDestinationEdge);
    adjacencyList[destination].add(destinationToSourceEdge);
  }

  // Code to remove a directed edge
  public void removeDirectedEdge(int source, int destination) {
    for (GraphEdge edge : adjacencyList[source])
      if (edge.getDestination() == destination) {
        adjacencyList[source].remove(edge);
        break;
      }
  }

  // Code to remove an undirected edge
  public void removeUndirectedEdge(int source, int destination) {
    removeDirectedEdge(source, destination);
    removeDirectedEdge(destination, source);
  }

  public List<GraphEdge>[] getVertices() {
    return adjacencyList;
  }

  public static void main(String[] args) {
    // Creating a graph that has 5 vertices
    //  0             2
    //  | \          /
    //  |  \        /
    // 4|   \ 6    / 8
    //  |    \    /
    //  |  1  \  /
    //  1------4                 3
    //   \           7          /
    //    ----------------------

    WeightedGraph graph = new WeightedGraph(5);
    graph.addUndirectedEdge(0,1,4);
    graph.addUndirectedEdge(0,4,6);
    graph.addUndirectedEdge(1,4,1);
    graph.addUndirectedEdge(1,3,7);
    graph.addUndirectedEdge(4,2,8);

    // Code to print the graph
    List<GraphEdge>[] vertices = graph.getVertices();
    for (int i = 0; i < vertices.length; i++) {
      System.out.print("Vertex " + i + " is connected to: ");
      for (GraphEdge edge : vertices[i])
        System.out.print(edge.getDestination() + " ");
      System.out.println();
    }
  }
}
