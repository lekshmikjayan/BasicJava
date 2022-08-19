import java.util.Scanner;

public class oddeven{
    public static void main (String[] args){
        int n;
        Scanner s = new Scanner (System.in);

         System.out.println("Enter the numbers of elements in an array: ");
        n = s.nextInt();
         int a[] = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i =0; i<n; i++){
             a[i] = s.nextInt();
        }
       
    System.out.println("Odd numbers: ");
    for (int i=0; i<n; i++){
        if (a[i] % 2 != 0){
            System.out.println(a[i] + " ");
        }
    }

System.out.println("even numbers: ");
    for (int i=0; i<n; i++){
        if (a[i] % 2 == 0){
            System.out.println(a[i] + " ");
        }
    }
    }
}