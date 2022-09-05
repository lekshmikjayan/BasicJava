import java.io.FileWriter;
import java.io.IOException;

public class Wrtfl{
    public static void main(String[]args){
        try{
            FileWriter obj = new FileWriter("Real.txt");
            obj.write("Reality is so confusing");
            obj.write("....whats happening ..!!!");
            obj.close();
            System.out.println("Completed");
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}