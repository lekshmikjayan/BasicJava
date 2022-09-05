import java.io.File;
import java.io.IOException;

public class Crtfl{
    public static void main (String[]args){
        try {
            File ob = new File ("Real.txt");
            if (ob.createNewFile()){
                System.out.println("File created :" + ob.getName());
            } else {
                 System.out.println("File exist ");
            } 
            }catch (IOException e){
                System.out.println("halloo");
                e.printStackTrace();
            }
        }     
}