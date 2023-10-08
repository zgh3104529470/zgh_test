package tset_1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("张无忌");
        arr.add("周芷若");
        arr.add("赵敏");
        arr.add("张三丰");
        arr.add("张强");
        arr.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));

        //链式
        arr.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));

        //limit获取前几个，skip跳过前几个
        arr.stream().limit(4).forEach(s -> System.out.println(s));
        arr.stream().skip(4).forEach(s -> System.out.println(s));
    }
}
