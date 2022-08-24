import java.util.Scanner;

public class Check{
    public static void main (String[]args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
         a = sc.nextInt();
         b = sc.nextInt();
         int z, y, x;
         z = (a + b);
         y = (a - b);
         x = (a * b);
        System.out.println("sum is : " + z);
        System.out.println("Diff is : " + y);
        System.out.println("Product is : " + x);
    }
}