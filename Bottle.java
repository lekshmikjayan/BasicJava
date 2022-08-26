public class Bottle{
    public int nmn(int x, int y){
        return(x * y);
    }

public static void main (String[]args){
    Bottle b = new Bottle();
    Plastic p = new Plastic();
    Glass g = new Glass();
    System.out.println(b.nmn(7,9));
 System.out.println(p.nmn(4,5));
  System.out.println(g.nmn(65,5));
}

}
class Plastic extends Bottle{
    public int nmn(int a , int b){
    return(a + b);   
    }
}

class Glass extends Plastic{
    public int nmn(int d, int h){
        return(d / h);
    }
}

