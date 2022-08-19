import java.util.Scanner;
public class largest{
public static void main (String []args){

int n, max;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of elements in an array");

n = s.nextInt();
int b[] = new int[n];
System.out.println("Enter the elements: ");

for (int i=0; i<n; i++){
   b[i] = s.nextInt();
}

max = 0;

for(int i=0; i<n; i++){
    if (max < b[i]){
        max = b[i];
    }

}
System.out.println("Largest number is " + max);
}
}