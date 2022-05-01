
import java.util.Scanner;


public class depositeShakil {
    public static void main(String[] args) {
        int amount,n,avg,i;
        String name;
        double deposit,t;
        System.out.print("Enter the amount: ");
        Scanner input =new Scanner(System.in);
        amount = input.nextInt();
        System.out.print("Enter the number: ");
          n = input.nextInt();
          avg = amount/n;
          for(i=0;i<=n;i++){
              System.out.print("Enter your name: ");
              name=input.next();
               System.out.print("Enter your deposit amount: ");
              deposit = input.nextDouble();
              t=avg+deposit;
              System.out.print("Total amount = "+t);
          
          }
    }
}
