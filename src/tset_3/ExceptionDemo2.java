package tset_3;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(max);
    }
    public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException {
        if(arr == null){
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
