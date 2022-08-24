public class Bottle{
    public void nmn(int x, int y){
        System.out.println(x * y);
    }

public static void main (String[]args){
    Bottle b = new Bottle();
    Plastic p = new Plastic();
    Glass g = new Glass();
    b.nmn(7,9);
  p.nmn(4,5);
  g.nmn(65,5);
}

}
class Plastic extends Bottle{
    public void nmn(int a , int b){
     System.out.println(a + b);   
    }
}

class Glass extends Plastic{
    public void nmn(int d, int h){
        System.out.println(d / h);
    }
}

