package Arama_Algoritmalar;


import java.util.Scanner;
import java.util.Arrays;

public class DijkstraAlgorithm_3_9 {
    private static final int NO_PARENT = -1;

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Düğüm sayısını girin:");
        int numberOfVertices = scanner.nextInt();

        int[][] adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
        for (int[] row : adjacencyMatrix) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        System.out.println("Kenar sayısını girin:");
        int numberOfEdges = scanner.nextInt();
        System.out.println("Her kenar için başlangıç, bitiş düğümü ve ağırlığı girin:");
        for (int i = 0; i < numberOfEdges; i++) {
            int startVertex = scanner.nextInt();
            int endVertex = scanner.nextInt();
            int weight = scanner.nextInt();
            adjacencyMatrix[startVertex][endVertex] = weight;
            adjacencyMatrix[endVertex][startVertex] = weight; // Eğer graf yönsüzse
        }

        System.out.println("Başlangıç düğümünü girin:");
        int startVertex = scanner.nextInt();

        dijkstra(adjacencyMatrix, startVertex);
        scanner.close();
    }

    private static void dijkstra(int[][] adjacencyMatrix, int startVertex) {
        int nVertices = adjacencyMatrix[0].length;
        int[] shortestDistances = new int[nVertices];
        boolean[] added = new boolean[nVertices];

        Arrays.fill(shortestDistances, Integer.MAX_VALUE);
        Arrays.fill(added, false);

        shortestDistances[startVertex] = 0;

        int[] parents = new int[nVertices];
        Arrays.fill(parents, NO_PARENT);

        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            added[nearestVertex] = true;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    private static void printSolution(int startVertex, int[] distances, int[] parents) {
        System.out.println("Düğüm\tMesafe\tYol");
        for (int vertexIndex = 0; vertexIndex < distances.length; vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    private static void printPath(int currentVertex, int[] parents) {
        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }
}
