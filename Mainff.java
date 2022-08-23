interface Abst{
    public  void show(); 
    public void method();
}

class Fruit implements Abst{
    public void show(){
        System.out.println("blue");
    }
     public void method(){
        System.out.println("Red");
    }
}

class Mainff{
    public static void main (String[] args){
       Fruit a = new Fruit();
        a.method();
        a.show();
       
    }
}
