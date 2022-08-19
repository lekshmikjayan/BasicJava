import java.util.Scanner;

public class taks4{
    public static void main(String args[]){
        int n,a,b, square;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        a = s.nextInt();
        b= s.nextInt();

        if(a%4==0 && b%4 == 0){
            System.out.println("Before swapping " + a + " "+ b);
            n= a;
            a = b;
            b =n;
            System.out.print("after swapping " + a + " "+ b);

        } else {
            square = (a*a) + (b*b) ;
            System.out.println(square);
        }



    }
}







