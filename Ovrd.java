public class Ovrd{
    public int dif(int x, int y){
        return x - y;
    }

public static void main(String[]args){
    Ovrd o = new Ovrd();
    Mul m =new Mul();
    System.out.println(o.dif(7,4));
    System.out.println(m.dif(7,4));
}

}
class Mul extends Ovrd{
    public int dif(int a, int b){
        return a * b;
    }
}