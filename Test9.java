public class Test9{
    public static void main (String[]args){
        int[] ar = {1,3,4,6,8,9,5,3,3,6,8,54};
        for (int i = 0; i<=ar.length; i ++){
            if (i == 5) {
                continue;
            }
            if (i ==7){
                break;
            }
            System.out.println(ar[i]);
        }
    }
}