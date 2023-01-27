package Ch01_ArraysAndStrings.Q08_Zero_Matrix;

import java.util.ArrayList;

public class SolutionA {

    public static void zeroMatrix(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> cols = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // make row values 0
        for (Integer row : rows) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }

        // make col values 0
        for (Integer col : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        StringBuilder divider = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ", ");
                if (i == 0) {
                    divider.append("---");
                }
            }
            System.out.println();
        }
        System.out.println(divider);
    }

    public static void main(String[] args) {
        int[][] m = {
                { 0, 1, 2, 3, 4, 1, 2, 3, 4 },
                { 1, 1, 2, 3, 4, 1, 2, 3, 4 },
                { 1, 1, 2, 3, 0, 1, 2, 3, 4 },
                { 1, 1, 2, 3, 4, 1, 2, 3, 4 },
        };

        printMatrix(m);
        zeroMatrix(m);
        printMatrix(m);
    }
}
