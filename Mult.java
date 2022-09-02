import java.util.Scanner;

public class Mult{
    public static void main (String[]args){
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1st number");
        a = s.nextInt();
         System.out.println("enter 2nd number");
        b = s.nextInt();
        int z;
        z = a*b;
if (z<50){
       System.out.println("Pdt is : under 50");
    } else {
         System.out.println("Pdt is : above 50");
    }
    }
}