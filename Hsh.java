import java.util.HashMap;

public class Hsh{
    public static void main(String[]args){
        HashMap<String, String> abc = new HashMap<String, String> ();
        abc.put("Kerala", "Kollam");
        abc.put("Tamil nadu", "Chennai");

        System.out.println(abc.get("Kerala"));
        System.out.println(abc.size());
    }
}