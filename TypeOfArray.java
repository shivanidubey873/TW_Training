package com.tw;
import java.util.Scanner;

public class TypeOfArray {
    static int checkType(int n, int[] array){
        boolean isOdd=false,isEven=false;
        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                isEven=true;
            }
            else{
                isOdd=true;
            }
            if(isEven && isOdd){
                return 3;
            }
        }
        if(isEven){
            return 1;
        }
        else {
            return 2;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int[] array;
        n = scan.nextInt();
        array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= scan.nextInt();
        }
        int type=checkType(n,array);
        if(type==1){
            System.out.println("Even");
        }
        else if(type==2){
            System.out.println("Odd");
        }
        else {
            System.out.println("Mixed");
        }
    }
}
