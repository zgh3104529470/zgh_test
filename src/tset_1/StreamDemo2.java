package tset_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3");
        list.stream().forEach(name -> System.out.println(name));
        System.out.println("-------------------------------------");


        //双列集合
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.keySet().stream().forEach(name -> System.out.println(name+","+hm.get(name)));
        hm.entrySet().stream().forEach(s -> System.out.println(s));
        System.out.println("-------------------------------------");


        //数组
        int [] arr = {1,2,3};
        Arrays.stream(arr).forEach(s -> System.out.println(s ));
        System.out.println("-------------------------------------");


        //零散数据
        Stream.of(1,2,3).forEach(s -> System.out.println(s));
        //stream也可以放数组（引用数据类型）
        Integer [] arr_x = {1,2,3,4,5};
        Stream.of(arr_x).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------------");
    }
}
