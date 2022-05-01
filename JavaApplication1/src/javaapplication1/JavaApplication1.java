package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     
        int n,i;
        System.out.print("Enter a number: ");
        n=input.nextInt();
           int [] a=new int [n];
        a[0]=1;
        a[1]=1;
        for (i = 2; i < n; i++) {
            a[i]=a[i-1]+a[i-2];                
            }
        System.out.println("\n\n");
        System.out.println("The fibonacci series is: ");
        for(i=0;i<n;i++)
        {
            System.out.println("  "+a[i]);
        }
        }
    }
   
