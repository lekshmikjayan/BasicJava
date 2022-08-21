public class Encap{
    private int id;

    public int getid (){
        return id;
    }
     
    public void setid(int newid){
        this.id = newid;
    }

public static void main (String [] args){
    Encap obj = new Encap();
    obj.setid(24);
System.out.println(obj.getid());
     }
}