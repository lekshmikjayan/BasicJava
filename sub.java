class Outclass{
    int a =88;

  class Inclass{
        public int method(){
            return a;
        }
    }
}

public class sub{
    public static void main(String[]args){
Outclass out = new Outclass();
Outclass.Inclass in = out.new Inclass();

System.out.println(in.method());

    }
}