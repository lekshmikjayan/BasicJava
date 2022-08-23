public class Enm{
enum Level{
    Low,
    medium,
    high
}


public static void main (String[] args){
    Level var = Level.Low;

switch (var){
case Low:
System.out.println("low");
break;

case medium:
System.out.println("Medium");
break;

case high:
System.out.println("High");
}
}
}