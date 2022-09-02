public class Objjt{
    static String show(String name){
        return name;
    }
    public int view(int a, int b){
        return a * b ;
    }
    public static void main (String[]args){
        Objjt o = new Objjt();
        System.out.println(o.show("lkj"));
        
      System.out.println(o.view(4,6));
    }
}