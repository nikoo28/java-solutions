package util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {

  // Code to find the shortest path from a source node using Dijkstra's algorithm
  public static int[] dijkstraShortestPath(WeightedGraph graph, int source) {
    // store all distances
    int[] distance = new int[graph.getVertices().length];
    Arrays.fill(distance, Integer.MAX_VALUE); // set all to infinity

    PriorityQueue<GraphEdge> priorityQueue =
        new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));

    distance[source] = 0;
    priorityQueue.add(new GraphEdge(source, source, 0));

    while (!priorityQueue.isEmpty()) {
      GraphEdge currentEdge = priorityQueue.poll();

      int destination = currentEdge.getDestination();

      for (GraphEdge edge : graph.getVertices()[destination]) {
        int newDistance = distance[destination] + edge.getWeight();

        if (newDistance < distance[edge.getDestination()]) {
          distance[edge.getDestination()] = newDistance;
          priorityQueue.add(new GraphEdge(edge.getSource(), edge.getDestination(), newDistance));
        }
      }
    }

    return distance;
  }

  /*
  * Function takes a weighted graph as a parameter.
  *
  */


  public static void main(String[] args) {
    // Creating a graph that has 6 vertices
    //          4
    //   0--------       -----------3-------
    //   |        \     / 3                 \ 2
    //   |         \   /           6         \
    //   | 4         2 ---------------------- 4
    //   |         /   \                     /
    //   |        /     \ 1                 / 3
    //   1--------       ---------5---------
    //          2

    WeightedGraph graph = new WeightedGraph(6);
    graph.addUndirectedEdge(0,1,4);
    graph.addUndirectedEdge(0,2,4);
    graph.addUndirectedEdge(1,2,2);
    graph.addUndirectedEdge(2,3,3);
    graph.addUndirectedEdge(2,4,6);
    graph.addUndirectedEdge(2,5,1);
    graph.addUndirectedEdge(3,4,2);
    graph.addUndirectedEdge(5,4,3);

    // Code to print the graph
    List<GraphEdge>[] vertices = graph.getVertices();
    for (int i = 0; i < vertices.length; i++) {
      System.out.print("Vertex " + i + " is connected to: ");
      for (GraphEdge edge : vertices[i])
        System.out.print(edge.getDestination() + " ");
      System.out.println();
    }

    for (int i : dijkstraShortestPath(graph, 0)) {
      System.out.println(i);
    }

  }

}
