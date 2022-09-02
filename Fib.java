public class Fib{
    public static void main (String[]args){
        int n = 100;
        int t1=0; 
        int t2 =1; //imitializing
        System.out.println("upto " + n + " :");
        while (t1<=n){
            System.out.println (t1 );
            int sum = t1 + t2;
            t1 =t2;
            t2 =sum;

        }

    }
}