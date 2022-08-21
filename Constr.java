public class Constr{
    int x;

    public Constr(int z){
        x = z;
    }

    public static void main (String [] args){
        Constr obj = new Constr(45);
       System.out.println(obj.x);
    }
}