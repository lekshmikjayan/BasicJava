import java.util.Scanner;

public class Testm{
    public static void main (String[]args){
        int a;
Scanner s = new Scanner (System.in);
  System.out.println("enter a number");
    a = s.nextInt();

    System.out.println("Multpln table of : " + a + " is");
    for (int i=1; i<=10; i++){
        System.out.println( a + "x" + i + "=" + (a*i));
    }
  
    }
}