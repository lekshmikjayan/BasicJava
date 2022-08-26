public class thrw{
    static void number(int age){

 if(age < 25){
   throw new ArithmeticException("Success");
 }else{
  throw new ArithmeticException("neutral");  
 }
    }

public static void main (String[]args){
    number(29);
}
}