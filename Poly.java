public class Poly{
    public void show(){
        System.out.println("Different kinds of fruits are : ");
    }

public static void main (String[] args){
    Poly p = new Poly();
    Apple ap = new Apple();
    Orange or = new Orange();
p.show();
ap.show();
or.show();

}

}

class Apple extends Poly{
    public void show (){
        System.out.println("Is good for health - Apple ");
    }
}

class Orange extends Poly{
    public void show(){
        System.out.println("Is bitter but good : Orange ");
    }
}