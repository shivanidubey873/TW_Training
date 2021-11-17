package com.tw;
import java.util.Scanner;

public class MangoTree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col,treeNumber;
        row= sc.nextInt();
        col= sc.nextInt();
        treeNumber= sc.nextInt();
        if(row<=0 || col<=0 || treeNumber<=0 || treeNumber>=(row*col)){
            System.out.println("ERROR: There is some error in input");
        }
        else{
            int rowOfGivenTree,colOfGivenTree;
            rowOfGivenTree=treeNumber/row+1;
            colOfGivenTree=treeNumber%col;
            if(rowOfGivenTree==1 || colOfGivenTree==1 || colOfGivenTree==col){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}