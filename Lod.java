public class Lod{
    static int view(int x, int y){
        return x + y;
    }
    static double view(double x, double y){
        return x - y;
    }

public static void main (String[]args){
    int a = view(6,8);
double b = view(55.35, 33.12);
System.out.println(a);
System.out.println(b);
}
}