public class Country{
    public int abc(int id ){
        return id;
    }
public static void main (String[] args){
    Country c = new Country();
    State s = new State();
    //c.abc(007);
    System.out.println(c.abc(777));
    s.abc("Canada");
    s.abc("Kerala");
}



}
class State extends Country{
    public void abc(String location){
System.out.println(location);
    }
}