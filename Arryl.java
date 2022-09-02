import java.util.ArrayList;

public class Arryl{
    public static void main (String[]args){
     /*   ArrayList <Integer> num = new ArrayList <Integer>() ;
        num.add(4);
        num.add(9);
        num.add(8);
        num.add(7);
        num.add(6);
        num.remove(2);
        System.out.println(num.size());*/

       // String s = "Welcome \b Home";
       // System.out.println(s);

       int result = sum(5);
       System.out.println(result);
    }//recursion
       public static int sum(int k){
        if (k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
       }
    }


