public class Enc{
    private String place;
    private int id;

    public String getplace(){
        return place;
    }

    public int getid(){
        return id;
    }

public void setplace(String newplace){
    this.place = newplace;
}
 public void setid(int newid){
    this.id = newid;
 }

public static void main (String[] args){
    Enc obj = new Enc();
     obj.setid(46);
     obj.setplace("tvm");

     System.out.println("My id is " + obj.getid() +" "+ obj.getplace());
}


}