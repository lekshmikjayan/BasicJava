public class Kitchen{
    public int cook(int x, int y){
   return x * y;
    }
    public void boil(){
        System.out.println("come lets drink water");
    }

public static void main(String[]args){
Inhrt i = new Inhrt();
Room r = new Room();
Home h = new Home();
System.out.println(r.desk(3,5,67));
     System.out.println(i.cook(4,7));
//i.cook();
r.eat();
r.boil();
System.out.println(h.bomb("Leksh"));
}
}

class Inhrt extends Kitchen{
    public void eat(){
        System.out.println("i love to eat");
    }
}

class Room extends Inhrt{
    public int desk(int x, int y, int z){
        return x + y + z;
    }

    public void eat(){
        System.out.println("Mayakkammaa");
    }
}

class Home extends Inhrt{
    public String bomb(String name){
        return name;
    }
}

