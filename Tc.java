import java.util.Scanner;

public class Tc{
    public static void main (String[]args){
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1st number");
         a = s.nextInt();
System.out.println("enter 2nd number");
         b = s.nextInt();
System.out.println("enter 3rd number");
         c = s.nextInt();
System.out.println("enter 4th number");
         d = s.nextInt();
if (a==b && b==c && c==d && d==a){
    System.out.println("same");
}else{
    System.out.println("not same");
}
    }
}