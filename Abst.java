abstract class Abst{
     abstract void view();
     public void show(){
        System.out.println("jhgfkagkf");
     }

public static void main (String[]args){
//no object creation for abstract class..!!!!!
    PQR p = new PQR();
    p.show();
    p.view();
}

} 
class PQR extends Abst{
    void view (){
        System.out.println(" nsf jf ");
    }
}