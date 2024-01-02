package util;

import java.util.*;

public class MinimumSpanningTree {

  public List<GraphEdge> primMST(WeightedGraph graph) {
    List<GraphEdge>[] vertices = graph.getVertices();

    boolean[] inMST = new boolean[vertices.length];
    PriorityQueue<GraphEdge> priorityQueue =
        new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));

    List<GraphEdge> mstEdges = new ArrayList<>();

    // Start from vertex 0
    int startVertex = 0;
    inMST[startVertex] = true;

    // Add all edges from the start vertex to the priority queue
    priorityQueue.addAll(vertices[startVertex]);

    while (!priorityQueue.isEmpty()) {
      GraphEdge currentEdge = priorityQueue.poll();

      int destination = currentEdge.getDestination();

      // Skip if the destination is already in the MST
      if (inMST[destination]) continue;

      // Else add the current edge to the MST
      mstEdges.add(currentEdge);
      inMST[destination] = true;

      // Add all edges from the destination to the priority queue
      priorityQueue.addAll(vertices[destination]);
    }

    return mstEdges;
  }

  // Find the minimum spanning tree using Kruskal's algorithm
  public List<GraphEdge> kruskalMST(WeightedGraph graph) {
    List<GraphEdge>[] vertices = graph.getVertices();

    // Create a priority queue to store all the edges
    PriorityQueue<GraphEdge> priorityQueue =
        new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));

    // Add all the edges to the priority queue
    for (List<GraphEdge> edges : vertices)
      priorityQueue.addAll(edges);

    // Create a list to store the MST edges
    List<GraphEdge> mstEdges = new ArrayList<>();

    // Create a set to store the vertices that are already in the MST
    Set<Integer> inMST = new HashSet<>();

    // Keep polling the edges from the priority queue until the queue is empty
    while (!priorityQueue.isEmpty()) {
      GraphEdge currentEdge = priorityQueue.poll();

      int source = currentEdge.getSource();
      int destination = currentEdge.getDestination();

      // Skip if the edge forms a cycle
      if (inMST.contains(source) && inMST.contains(destination))
        continue;

      // Else add the current edge to the MST
      mstEdges.add(currentEdge);
      inMST.add(source);
      inMST.add(destination);
    }

    // Print the MST edges
    System.out.println("Minimum Spanning Tree Edges:");
    for (GraphEdge edge : mstEdges)
      System.out.println(edge.getSource() + " - " + edge.getDestination() + " : " + edge.getWeight());

    return mstEdges;
  }


}
