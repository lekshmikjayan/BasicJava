import java.util.HashMap;

public class State{
    public static void main (String[] args){
        HashMap <String, Integer> b = new HashMap <String, Integer> ();
        b.put("Kerala", 1);
        b.put("Tn",2);
        b.put("Karnataka", 3);
        b.put("Delhi", 4);
b.remove("Tn");
//b.size();

for (String i : b.keySet()){
        System.out.println("key is : " + i + " and value is " + b.get(i));
    }
    }
}