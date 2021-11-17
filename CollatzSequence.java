package com.tw;
import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n,countOperations=0;
        n = scan.nextInt();
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            countOperations+=1;
            System.out.print(n+" ");
        }
        System.out.println(countOperations);
    }
}
