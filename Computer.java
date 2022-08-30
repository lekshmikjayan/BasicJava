public class Computer{
    public String view(String name){
        return name;
    }

public static void main(String[]args){
    Computer c = new Computer();
    CPU cp = new CPU();
    Monitor m = new Monitor();
    System.out.println(c.view("Leksh"));
     System.out.println(cp.view("Vavaa"));
      System.out.println(cp.show(100,5));
      m.sample();
}


}
class CPU extends Computer{
    public int show(int x, int z){
        return x/z;
    }
}
class Monitor extends CPU{
    public void sample(){
        System.out.println("Hey there...!!");
    }
}