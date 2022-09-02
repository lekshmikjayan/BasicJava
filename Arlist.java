import java.util.ArrayList;

public class Arlist{
    public static void main (String[]args){
        ArrayList <Integer> number = new ArrayList <Integer>();
        number.add(1997);
        number.add(1992);
        number.add(2021);
        number.add(2022);
        number.add(2073);
      /*  System.out.println(number);//getting arraylist
        System.out.println(number.get(2));//retreiving value
        System.out.println(number.set(4, 2075));//update value
        System.out.println(number.size());//length of arraylist
        */
       // for (int i=0; i<number.size(); i++){
         //   System.out.print(number.get(i) + " ");  for loop
        //}

        for (Integer i: number){
            System.out.print(i + " "); // for each loop
        }
    }
}