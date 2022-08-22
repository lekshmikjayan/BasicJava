public class Colleg {
    private String name;
    private String place;

    public String getname(){
        return name;
    }
    public String getplace(){
        return place;
    }

public void setname(String newname){
    this.name = newname;
}
public void setplace (String newplace){
    this.place = newplace;
}

 public static void main (String[] args){
    Deptt d = new Deptt();
    d.setid(2);
    d.setname("HANA");
    d.setplace("PKD");

    System.out.println("ID : " + d.getid());
    System.out.println("Name : " + d.getname());
    System.out.println("Place : " + d.getplace());
    }

}


 class Deptt extends Colleg{
    private int id;

    public int getid(){
        return id;
    }

    public void setid(int newid){
        this.id = newid;
    }

    
}


