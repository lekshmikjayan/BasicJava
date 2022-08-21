public class Data{
    int idn;
    String fname;

public Data(int id, String name){
    idn = id;
    fname = name;
}

public static void main (String [] args){
    Data obj = new Data (14, "tony");
    System.out.println("my id is " + obj.idn + " and I'm " + obj.fname);
}

}