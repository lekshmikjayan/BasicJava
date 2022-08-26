public class Const{
    String place;
    int year;

public Const (String pl, int yr){
    place = pl;
    year = yr;
}


public static void main (String[] args){
    Const c = new Const("tcm", 2345);
    System.out.println(c.place + c.year);
}

}