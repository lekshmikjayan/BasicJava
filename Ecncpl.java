public class Ecncpl{
    private int id;
    private int age;

    public int getid(){
        return id;
    }
    public void setid(int newid){
        this.id = newid;
    }

    public int getage(){
        return age;
    }

    public void setage(int newage){
        if (age>=0){
            this.age = newage;
        }
    }

    public static void main (String[]args){
        Ecncpl e = new Ecncpl();
        e.setid(7);
        e.setage(27);
        System.out.println(e.getid());
        System.out.println(e.getage());

    }
}