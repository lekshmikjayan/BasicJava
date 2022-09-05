    enum Speed{
        Low,
        High,
        Medium
    }

    public class Enumm{
public static void main (String[]args){
    Speed s = Speed.Medium;

    switch(s){
case Low:
    System.out.println("Loww");
case High:
 System.out.println("Highhh");
    case Medium:
     System.out.println("Mediummm");
     break;
    }
}

}