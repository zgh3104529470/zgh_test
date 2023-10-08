package tset_2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FonuctionDemo2 {
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

                return s.startsWith("张") && s.length() == 3;
            }
        }).forEach(s -> System.out.println(s));

        
    }
}
