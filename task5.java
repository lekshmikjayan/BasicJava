import java.util.Scanner;

public class task5{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year : ");
        n = s.nextInt();

        if(n%4 == 0){
            System.out.println("Is a leap year ");
        } else {
             System.out.println("Is not a leap year ");
        }
    }
}