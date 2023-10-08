package tset_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a-19","b-18","c-21");

        list.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                String[] arr = s.split("-");
                int num = Integer.parseInt(arr[1]);
                return num;
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------------");
        list.stream().map(s -> s.split("-")[1]).forEach(s -> System.out.println(s));
    }
}
