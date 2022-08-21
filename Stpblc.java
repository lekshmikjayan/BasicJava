public class Stpblc{
    static void stmethod(){
        System.out.println("no objects created - Static");
    }

    public void pbmethod(){
        System.out.println("Object should be created - Public");
    }

    public static void main (String [] args){
        stmethod();

        Stpblc obj = new Stpblc();
        obj.pbmethod();
    }
}