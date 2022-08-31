public class Tryen{
    private int number;
    private String name;
    private int speed;

public int getnumber(){
    return number;
}

public void setnumber(int newnum){
    this.number = newnum;
}

public String getname(){
    return name;
}

public void setname(String newname){
    this.name = newname;
}

public int getspeed(){
    return speed;
}

public void setspeed (int newspeed){
    this.speed = newspeed;
}

public static void main(String[]args){
    Tryen t = new  Tryen();
    t.setname( "gallo");
    t.setnumber(1997);
    t.setspeed(222);;

    System.out.println(t.getname());
 System.out.println(t.getspeed());
     System.out.println(t.getnumber());
}

}