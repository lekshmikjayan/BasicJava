/*public class Methd{
    static String myMethod(String place, String name){
        return ("Place is "+ place + " name is " + name);
    }

    public static void main(String[] args){
        System.out.println( myMethod("tvm", "anu"));
       
    }
}*/

public class Methd{
    static int myMethod (int x, int z){
        return x + z;
    }
    static String myMethod (String name){
        return name;
    }

    static double myMethod(double y){
        return y;
    } 

public static void main (String [] args){
    int i = myMethod(11, 7);
    String s = myMethod("aghduahsy");
    double d = myMethod(12.445);

    System.out.println(i + " " + s + " " + d);



}

}