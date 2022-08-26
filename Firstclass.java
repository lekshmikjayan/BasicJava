interface Firstclass{
    public void view ();
    public void show();

    public static void main (String[] args){
         Third t = new Third();
         Four f = new Four();
    t.view();
    t.show();
    t.focus();
    f.focus();
    }
}


interface Secondclass{
    public void focus();
}

class Third implements Firstclass, Secondclass{
   public void view(){
    System.out.println("afjslfkn");
   }

   public void show(){
    System.out.println("haiiiii");
   }

   public void focus(){
    System.out.println("byeeeee");
   }
}

class Four implements Secondclass{
    public void focus(){
    System.out.println("???????");
   }
}

    