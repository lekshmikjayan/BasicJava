import java.util.Scanner;
public class Evnodd{
    public static void main (String[]args){
int num;
int evenSum = 0;
int oddSum = 0;
    Scanner s = new Scanner (System.in);
//System.out.println("enter the numbers ");
 

    System.out.println("enter no");
    num = s.nextInt(); 
    if (num %2 == 0){
        evenSum = evenSum + num;
    } else {
        oddSum = oddSum + num;
    }

System.out.println(evenSum);
System.out.println(oddSum);
    }
    }
