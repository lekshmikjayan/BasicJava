import java.util.Scanner;
public class sumar{
    public static void main(String args[]){
        int b= 0;
    //   int sum = 0;
        int ar[] = new int [5];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the elements : ");
            for(int i=0; i<=4; i++){
                ar[i] = s.nextInt();
            }
             System.out.println();
        System.out.println("Array elements are : " );
        for(int i=0; i<=4; i++){
            System.out.print(ar[i] + " ");
        }


for(int i =0; i<=4; i++){
       if(b < ar[i]){ b = ar[i];
       ar[i] = b;
       }
}
       System.out.println();
System.out.println("Largest number is : " + b);


System.out.print("Even numbers are : ");
  System.out.println(); 
for( int i =0; i<=4; i++){
    if (ar[i] % 2 == 0){
     
        System.out.print(ar[i] + " ");
    }
}
    int sum =0;
       System.out.println();
              System.out.println("Sum of elements : ");
              for (int i=0; i<=4; i++){
                sum = sum + ar[i];
              }
                       System.out.print(sum);

    int avg = 0;
 System.out.println();
              System.out.println("Avg of elements : ");
              for (int i=0; i<=4; i++){
                avg = (avg + ar[i]) / 2;
              }
                       System.out.print(avg);
              }
         

    }
