package tset_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,"a","a","b","c","d");
        //终结方法
        //遍历
        arr.stream().forEach(s -> System.out.println(s));
        //计数
        long num = arr.stream().count();
        System.out.println(num);
        //数组
        String[] arr2 = arr.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr2));

        String[] arr1 = arr.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr1));
    }
}
