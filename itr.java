import java.util.ArrayList;
import java.util.Iterator;

public class itr{
    public static void main (String[]args){
        ArrayList <String> ar = new ArrayList <String>();
        ar.add("pen");
        ar.add("pencil");
        ar.add("Lap");
        ar.add("balm");
        ar.add("water");

        Iterator <String> it = ar.iterator();
       // System.out.println(it.next());// first element

        while(it.hasNext()){
           String i = it.next();
           if (i == "pen"){
            it.remove();
           }

           System.out.println(ar);
        }



    }
}