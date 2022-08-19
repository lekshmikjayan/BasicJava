import java.util.Scanner;
public class task3{
    public static void main(String args[]){
        int n;
        Scanner s =  new Scanner(System.in);

        System.out.println("Is the given number div by 5");
        n = s.nextInt();

        if(n%5 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            
        }

    }
}