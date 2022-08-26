public class Obj{
    static int show(int x, int y){
        return x * y;
    }

    public int view(int a, int b){
        return a/b ;
    }

public static void main (String[] args){
System.out.println( show(5,8));

   Obj o = new Obj();
   System.out.println(o.view(100,5));

}

}