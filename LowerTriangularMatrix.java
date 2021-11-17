package com.tw;

import java.util.Scanner;

public class LowerTriangularMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        int[][] matrix;
        row = scan.nextInt();
        col = scan.nextInt();
        matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        boolean isLowerTriangularMatrix = true;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                if (matrix[i][j] != 0) {
                    isLowerTriangularMatrix = false;
                    break;
                }
            }
        }
        if (isLowerTriangularMatrix) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
