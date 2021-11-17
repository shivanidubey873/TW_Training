package com.tw;
import java.util.Scanner;

public class FindRange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int[] array;
        n = scan.nextInt();
        array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= scan.nextInt();
        }
        int min=array[0],max=array[0];
        for(int i=1;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(max-min);
    }
}
