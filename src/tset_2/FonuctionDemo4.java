package tset_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FonuctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        /*List<String> list1 = list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                String str = s.toUpperCase();
                return str;
            }
        }).collect(Collectors.toList());*/
        List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list1);
    }
}
