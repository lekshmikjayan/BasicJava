public class Ovr{
    public int sum(int x, int y){
        return x * y;
    }
    public int sum(int a, int b, int c){
        return a - b - c;
    }

    public static void main (String[]args){
        Ovr o = new Ovr();
        System.out.println(o.sum(5,6));
        System.out.println(o.sum(100,4,7));
    }
}