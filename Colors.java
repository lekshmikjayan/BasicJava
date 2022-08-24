import java.util.ArrayList;
public class Colors{
public static void main (String[]args){
    ArrayList<Integer> c =new ArrayList<Integer>();
    c.add(10);
    c.add(2);
    c.add(45);
    c.add(56);
    c.add(66);
  /*  System.out.println(c.set(2, 99));
    System.out.println(c.remove(4));
    System.out.println(c); */

    for (int i =0; i<c.size(); i++){
        System.out.print( c.get(i) + " ");
    }
}
}
