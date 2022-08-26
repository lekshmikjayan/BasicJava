public class tryctch{
    public static void main (String[] args){
        try{
        int [] name = {1,2,3,4};
        System.out.println(name[33]);
        } catch (Exception e ){
            System.out.println("Something wrong");
        } finally {
            System.out.println("Everything is gonna be okey");
        }
    }
}