package Arama_Algoritmalar;

class FloydWarshall_3_6 {
    final static int INF = 9999;
    final static int nV = 4;

    void floydWarshall(int[][] graph) {
        int[][] matrix = new int[nV][nV];
        int i, j, k;

        for (i = 0; i < nV; i++)
            for (j = 0; j < nV; j++)
                matrix[i][j] = graph[i][j];

        // Düğümleri tek tek ekleyin
        for (k = 0; k < nV; k++)
            for (i = 0; i < nV; i++)
                for (j = 0; j < nV; j++)
                    if (matrix[i][k] != INF && matrix[k][j] != INF && matrix[i][k] + matrix[k][j] < matrix[i][j]) {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
    }

    public static void main() {
        int[][] graph = { { 0, 3, INF, 7 }, { 8, 0, 2, INF }, { 5, INF, 0, 1 }, { 2, INF, INF, 0 } };
        FloydWarshall_3_6 fw = new FloydWarshall_3_6();
        fw.floydWarshall(graph);
    }
}

