interface blue{
    public void color();

public static void main(String[]args){
    Green g = new Green ();
    g.color();
   System.out.println(g.table(4,8));
}
}
interface red{
    public int table(int x, int y);
}
class Green implements blue, red{
    
    public void color(){
        System.out.println("hskfjkej");
    }
    public int table (int x, int y){
        return x+y;
    }

}
