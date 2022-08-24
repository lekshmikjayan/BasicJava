import java.util.ArrayList;

public class Brand{
    public static void main (String[] args){
        ArrayList <String> ar = new ArrayList <String> ();
        ar.add("Fastrack");
        ar.add("nike");
        ar.add("puma");
        ar.add("Calvin Klein");
        ar.add("G-shock");              
//ar.clear();
//ar.size();
      //  System.out.println(ar.set(2, "Mercedez"));
      // System.out.println(ar.remove(1));
        //System.out.println(ar.size());
      //  for (String i : ar){
        //    System.out.print(i + "  ");
        //}

for (int i = 0; i<ar.size(); i++){
    System.out.print(ar.get(i) + " ");
}

    }
}






















