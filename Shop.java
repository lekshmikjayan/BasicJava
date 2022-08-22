public class Shop{
    String location;
    int phone;

    public String getlocation(){
        return location;
    }

    public int getphone(){
        return phone;
    }

    public void setlocation(String newloc){
        this.location = newloc;
    }

    public void setphone(int ph){
        this.phone = ph;
    }


public static void main (String[] args){
    Furniture f = new Furniture();
    Electronics e = new Electronics();
    f.setlocation("kerala");
    f.setphone(13241);
    f.setname("woodssss");
    e.setid(1);
    e.setlocation("Tamil nadu");
    e.setname("Fuse out");
    e.setphone(213154);
    
    System.out.println(e.getid());
     System.out.println(e.getlocation());
      System.out.println(e.getname());
       System.out.println(e.getphone());
    System.out.println(f.getlocation());
    System.out.println(f.getphone());
    System.out.println(f.getname());


}

}

 class Furniture extends Shop{
    private String name;

public String getname(){
    return name;
}

public void setname (String fname){
    this.name = fname;

}
}


 class Electronics extends Furniture{
    private int id;

    public int getid(){
    return id;
    }

    public void setid (int newid){
        this.id = newid;
    }

}