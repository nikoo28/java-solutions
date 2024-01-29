package util;

import java.util.*;

public class GraphColoring {

  public Map<Integer, Integer> colorGraph(WeightedGraph graph) {
    List<GraphEdge>[] vertices = graph.getVertices();
    Map<Integer, Integer> colorMap = new HashMap<>();

    // Iterate over each vertex
    for (int vertex = 0; vertex < vertices.length; vertex++) {

      // Find all neighboring colors
      Set<Integer> neighborColors = new HashSet<>();

      for (GraphEdge edge : vertices[vertex])
        if (colorMap.containsKey(edge.getDestination()))
          neighborColors.add(colorMap.get(edge.getDestination()));

      // Find the color number that is not used by the neighbors
      int color = 1;
      while (neighborColors.contains(color))
        color++;

      colorMap.put(vertex, color);
    }

    return colorMap;
  }

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
    graph.addUndirectedEdge(0, 1, 4);
    graph.addUndirectedEdge(0, 2, 4);
    graph.addUndirectedEdge(1, 2, 2);
    graph.addUndirectedEdge(2, 3, 3);
    graph.addUndirectedEdge(2, 4, 6);
    graph.addUndirectedEdge(2, 5, 1);
    graph.addUndirectedEdge(3, 4, 2);
    graph.addUndirectedEdge(5, 4, 3);

    GraphColoring graphColoring = new GraphColoring();
    Map<Integer, Integer> colorMap = graphColoring.colorGraph(graph);

    System.out.println("Node colors:");

    int maxColorValue = -1;
    for (Map.Entry<Integer, Integer> entry : colorMap.entrySet()) {
      maxColorValue = Math.max(maxColorValue, entry.getValue());
      System.out.println("Node " + entry.getKey() + " -> Color " + entry.getValue());
    }
    System.out.println("Minimum number of colors used: " + maxColorValue);
  }
}
