public class Ovrlodng{
   int x = 2;
   int y = 4;
    int a= 6;
        public int abc(){
            return this.x;
        }

        public int def(){
            return this.y;
        }

        public int lmn(){
            return this.a;
        }
        
        void add (){
           x = x+44;
           y = y+1;
            a = x +y;;
        }

        public static void main (String [] args){
            Ovrlodng s = new Ovrlodng();
            s.add();

           int p = s.abc();
            int q = s.def();
             int r = s.lmn();

            System.out.println(p);
            System.out.println(q);
             System.out.println(r);

        }

}
    
