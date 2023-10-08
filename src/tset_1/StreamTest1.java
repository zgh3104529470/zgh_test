package tset_1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set,1,2,3,4,5,6,7,8,9);
        Set<Integer> set1 = set.stream().filter(s -> s % 2 == 0).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
