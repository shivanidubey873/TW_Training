package com.tw;
import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row,col;
        int[][] matrix;
        row = scan.nextInt();
        col = scan.nextInt();
        matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        boolean isUpperTriangularMatrix=true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>j){
                    if(matrix[i][j]!=0){
                        isUpperTriangularMatrix=false;
                        break;
                    }
                }
            }
        }
        if(isUpperTriangularMatrix){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
