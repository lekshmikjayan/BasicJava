import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex{
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("Instagram");
        Matcher matcher = pattern.matcher("Visit Instagram");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Success");
    
        }else{
               System.out.println("Cant find");
        }
    }
}