interface main{
    public void show();
    public void view();
}

interface look{
    public void see();
}

class Book implements main, look{
    public void show(){
       System.out.println("hrello");
    }
    public void view () {
         System.out.println("fbkrejfb");
    }
     public void see () {
     System.out.println("vbrtbtrb");
    }


 
    public static void main (String[] args){
            Book b = new Book();
     b.show();
        b.view();
        b.see();
      // System.out.println(b.free(3,5));
    }
}
