public class birds{
    void birdSound(){
        System.out.println("Birds make noises");
    }
    public class main{
public static void main(String args[]){
    birds s = new birds();
    s.birdSound();
}
    }

}

 class Dove extends birds{
    void Dovesound(){
        super.birdSound();
        System.out.println("grrgrrrr");
    }
 }
