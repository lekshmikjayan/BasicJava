interface laptop{
    public void show();
    public void getn();

      public static void main (String[]args){
        home h = new home();
        h.show();
        h.getn();
        h.key();
    }
}
interface tv{
    public void key();
}

class home  implements laptop, tv{
    public void show(){
        System.out.println("khbdkvjbadv");
    }
    public void getn(){
        System.out.println("ahvbihqebvk");
    }
    public void key(){
        System.out.println("qhfvfkhvqk");
    }

  
}