package tset_3;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            /*String messeage = e.getMessage();
            System.out.println(messeage);
            String str = e.toString();
            System.out.println(str);*/
        }

    }
}
