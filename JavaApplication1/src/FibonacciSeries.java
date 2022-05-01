import java.util.Scanner;
public class FibonacciSeries {
 public static void main(String [] args){
     Scanner in =new Scanner(System.in);
    int n,i,first,second,fibo;
    System.out.print("Enter fibonacci series number: ");
   n=in.nextInt();
   first=0;
   second=1;
   System.out.println("\nThe fibonacci series is: ");
   for(i=0;i<n;i++)
   {
  
       fibo=first+second;
     
      first=second;
      second=fibo;
       System.out.println(" "+fibo);
   }
}  
    
}
