import java.util.HashSet;

public class set{
    public static void main (String[] args){
        HashSet <String> q = new HashSet <String>();
        q.add("Rain");
        q.add("Bottle");
        q.add("phone");
        q.add("Rain");
        q.add("specs");
//q.remove("phone");
       //System.out.println(q.size());
    
/*for (String i : q){
    System.out.print(i + " ");
}*/

for (int i =0;  i<q.size(); i++){
    if(q.contains("Rain")){
        System.out.print("Yes");
    }else{
        System.out.print("No");
    }
}

    }
}