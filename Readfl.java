import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfl{
    public static void main(String[]args){  
        try{
            File ob = new File("Real.txt");
            Scanner s = new Scanner(ob);
            while(s.hasNextLine()){
                String data = s.nextLine();
                System.out.println(data);
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("error");
            e.printStackTrace();
        } 
 
    }
}