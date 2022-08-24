import java.util.LinkedList;

public class lkd{
    public static void main (String [] args){
        LinkedList <String> lk = new LinkedList <String> ();
        lk.add("cat");
        lk.add("lion");
        lk.add("dog");
       //System.out.println(lk.set( 0, "horse"));
       lk.addFirst("beer");
       lk.addLast("ant");
       //lk.removeLast();
       System.out.println(lk.getFirst());
     // System.out.println(lk);

    }
}