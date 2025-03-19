// Addition of two square matrices

import java.util.*;

class Main {
    static void Addition(int[][] matrixA, int[][] matrixB, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        Addition(matrixA, matrixB, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
