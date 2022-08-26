public class Ensy{
    private int age;
    private String name;

    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }

    public void setage(int newage){
        this.age = newage;
    }

    public void setname(String newname){
        this.name = newname;
    }

    public static void main (String[]args){
        Ensy en = new Ensy();
        en.setage(24);
        en.setname("Lekshmi");

        System.out.println(en.getage() + " " + en.getname());
    }
}