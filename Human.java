public class Human{
    public void eye(){
        System.out.println("Vision");
    }
    public int eye(int x, int y){
        return x + y;
    }

    public static void main (String[]args){
        Human h = new Human();
        Body b = new Body();
        Head a = new Head();
        b.eye();
        System.out.println(b.eye(3,6));
        b.eye();
        System.out.println(a.eye("chkzz"));
       
    }
}

class Body extends Human{
    public void eye(){
        System.out.println("Listening");
    }
}

class Head extends Body{
    public String eye(String name){
        return name;
    }
}