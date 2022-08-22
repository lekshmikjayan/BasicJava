public class Cal{
    public void abc(int x, int y){
        System.out.println(x * y);
    } 

    public static void main(String[]args){
        Cal c = new Cal();
        Add ad = new Add();
        Sub s = new Sub();
        Div d = new Div();
      
      c.abc(3,3);
        ad.abc(3,4);
        s.abc(24,8);
        d.abc(50,5);

    }
}

class Add extends Cal{
    public void abc(int x, int y){
        System.out.println(x + y );
    }
}

class Sub extends Cal{
    public void abc(int x, int y){
        System.out.println(x - y);
    }
    
}
class Div extends Cal{
        public void abc(int x, int y){
            System.out.println(x / y);
        }
    }