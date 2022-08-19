import java.util.Scanner;

public class posng{
    public static void main(String args []){
int n;
        Scanner s = new Scanner(System.in);
    System.out.println("enter the number: ");

        n = s.nextInt();

        if (n<0){
             System.out.println("The given number" + " " + n +" " + " is Negative");
        }
        else if (n>0){
             System.out.println("Positive");
        }
        else {
            
             System.out.println("Zero");
        }
    
    }
    }
