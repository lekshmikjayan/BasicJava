public class Emp{
    int sid;
    String sname;
    String sdept;

public Emp(int id, String name, String dept){
    sid = id;
    sname = name;
    sdept = dept;
}



public static void main(String[]args){
    Emp obj = new Emp(1, "den" , "ABC");
    //Emp obj = new Emp(2, "den" , "ABC");
    System.out.println(obj.sid + obj.sname + obj.sdept);

}


}