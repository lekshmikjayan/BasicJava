interface Infc{
   public  void animal();
   public  void bird();

public static void main (String[]args){
    BMN b = new BMN();
    b.animal();
    b.bird();
    b.insect();
}
}
interface KLMN{
    public void insect();

}

class BMN implements Infc, KLMN{
  public   void animal(){
        System.out.println("bow bow");
    }
 public   void bird(){
        System.out.println("koo koo");
    }
    public void insect(){
        System.out.println("eeee eee");
    }
}