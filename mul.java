import java.util.Scanner;
public class mul{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
n = s.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}