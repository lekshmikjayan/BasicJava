public class Mob{
    private int fon;
    private String name;
    
public int getfon(int x){
    return x ;
}
public String getname(String name){
    return name;
}
public void setfon (int newfon){
    this.fon = newfon;
}
public void setname (String newname){
    this.name = newname;
}
 public static void main(String[] args){
        Mob b = new Mob();
       // b.setfon(9);
      //  b.setname("Lekshmi");

      System.out.println(b.getfon(9));
         System.out.println(b.getname("saff"));
    }
}
