package tset_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FonuctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a-19","b-18","c-21");
        /*List<Student> map = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split("-")[0];
                int age = Integer.parseInt(s.split("-")[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());*/
        List<Student> map1 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(map1);

        /*List<String> list1 = map1.stream().map(new Function<Student,String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).collect(Collectors.toList());*/

        List<String> list1 = map1.stream().map(Student::getName).collect(Collectors.toList());

        System.out.println(list1);
    }
}
