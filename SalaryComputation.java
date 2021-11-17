package com.tw;
import java.util.Scanner;

public class SalaryComputation {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] workedHours;
        workedHours=new int[7];
        for(int i=0;i<7;i++){
            workedHours[i]= scan.nextInt();
        }
        int salary=0,weeklyWorkedHours=0;
        for(int i=0;i<7;i++){
            if(i==0){
                salary+=workedHours[i]*100+(workedHours[i]*100)/2;
            }
            else if(i==6){
                salary+=workedHours[i]*100+(workedHours[i]*100)/4;
            }
            else{
                salary+=workedHours[i]*100;
                if(workedHours[i]>8){
                    salary+=(workedHours[i]-8)*15;
                }
                if(weeklyWorkedHours>40){
                    salary+=workedHours[i]*25;
                }
                else if((40-weeklyWorkedHours)>0 && (40-weeklyWorkedHours)<=workedHours[i]){
                    salary+=(workedHours[i]+weeklyWorkedHours-40)*25;
                }
                weeklyWorkedHours+=workedHours[i];
            }
        }
        System.out.println(salary);
    }
}
