abstract class Abt{
    abstract void see();
    abstract void show();
public static void main (String[]args){
    BTN b = new BTN();
    b.see();
    b.show(); 
}
}

class BTN extends Abt{
    void see(){
        System.out.println("welcome");
    }
    void show(){
        System.out.println("home");
    }
}