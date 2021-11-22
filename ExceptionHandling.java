package com.tw;
import java.util.Scanner;
import java.lang.Exception;
public class ExceptionHandling {
    static void solve(int[] arr) throws Exception
    {
        int ans=0;

        for(int i=0;i<10;i++)
            for(int j=i+1;j<10;j++)
                ans+=arr[i]/arr[j];

        throw new MyException(ans);
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int []arr= new int[n];
            in.nextLine();

            for(int i=0;i<10;i++)
                arr[i]=Integer.parseInt(in.nextLine());

            String s=in.nextLine();
            System.out.println(s.charAt(10));

            solve(arr);
        }
//Write your code here
        catch(ArithmeticException exception){
            System.out.println("Invalid division");
        }
        catch (NumberFormatException exception){
            System.out.println("Format mismatch");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index is invalid");
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("Index is invalid");
        }
        catch (MyException exception){
            System.out.println(exception.getMessage());
        }
        catch (Exception exception){
            System.out.println("Exception encountered");
        }
        finally {
            System.out.println("Exception Handling Completed");
        }
    }
}
//Write exception class here
class MyException extends Exception{
    public MyException(int ans){
        super("MyException["+ans+"]");
    }
}