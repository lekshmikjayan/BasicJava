interface abc{
    public int show(int x, int y);
    public int view(int a, int b);

    public static void main (String[]args){
        Checkk c = new Checkk();
       //Status s = new Status();
        System.out.println(c.show(2,3));
        System.out.println(c.view(4,6));
        System.out.println(c.look("Manu"));
     //   System.out.println(s.look("Lekshmi"));
    }
}

interface pqr extends abc{
    public String look(String name);
}
class Checkk implements abc, pqr{
    public int show (int x, int y){
        return x + y ;
    }
    public int view (int a, int b){
        return a * b ;
    }
    public String look(String name){
        return name;
    }

}
/*class Status implements pqr{
    public String look(String name){
        return name;
    }
}*/
