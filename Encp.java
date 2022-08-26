public class Encp{
    private int year;
    private String month;


public int getyear(){
    return year;
}
public String getmonth(){
    return month;
}

public void setyear(int newYear){
    this.year = newYear;
}
public void setmonth(String newMonth){
    this.month = newMonth; 
}

public static void main (String[]args){
    Encp e = new Encp ();
   e.setyear(2342);
   e.setmonth("Jan");
    System.out.println(e.getyear() + " " + e.getmonth());
}








}