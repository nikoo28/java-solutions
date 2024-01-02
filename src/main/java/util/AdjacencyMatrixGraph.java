package util;

public class AdjacencyMatrixGraph {

  private int adjMatrix[][];

  private int numVertices;

  // Initialize the matrix
  public AdjacencyMatrixGraph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new int[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int i, int j) {
    adjMatrix[i][j] = 1;
    adjMatrix[j][i] = 1;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
    adjMatrix[i][j] = 0;
    adjMatrix[j][i] = 0;
  }

  // Add a new vertex
  public void addVertex() {
    int[][] newAdjMatrix = new int[numVertices + 1][numVertices + 1];

    for (int i = 0; i < numVertices; i++)
      for (int j = 0; j < numVertices; j++)
        newAdjMatrix[i][j] = adjMatrix[i][j];

    adjMatrix = newAdjMatrix;
    numVertices++;
  }

  // Remove a vertex
  public void removeVertex(int v) {
    int[][] newAdjMatrix = new int[numVertices - 1][numVertices - 1];

    for (int i = 0; i < numVertices; i++)
      for (int j = 0; j < numVertices; j++)
        if (i != v && j != v)
          newAdjMatrix[i][j] = adjMatrix[i][j];

    adjMatrix = newAdjMatrix;
    numVertices--;
  }
}
