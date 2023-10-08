package tset_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<String> listmen = new ArrayList<>();
        ArrayList<String> listwomen = new ArrayList<>();
        Collections.addAll(listmen, "张三,23","王武柳,20",
                "曲斌喜,25","马碧进,33","王静,21","宁立恒,22");
        Collections.addAll(listwomen, "杨三,23","杨武柳,20",
                "欧阳斌喜,25","郝碧进,33","杨静,21","张立恒,22");
        Stream<String> newlistmen = listmen.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> newlistwomen = listwomen.stream()
                .filter(s -> s.startsWith("杨"))
                .skip(1);
        /*Stream.concat(newlistwomen,newlistmen).map(new Function<String, Actor>() {
            @Override
            public Actor apply (String s){
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name,age);
            }
        }).collect(Collectors.toList());*/
        List<Actor> list = Stream.concat(newlistwomen,newlistmen).map(s ->
                        new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                        .collect(Collectors.toList());
        System.out.println(list);
    }
}
