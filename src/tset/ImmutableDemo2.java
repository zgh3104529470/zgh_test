package tset;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        Set<Integer> list = Set.of(1,2,3,4,5);
        for (Integer integer : list) {
            System.out.println(integer);
        }


        Iterator<Integer> it = list.iterator();
        do{
            System.out.println(it.next());
        }while (it.hasNext());


        list.forEach(i -> System.out.println(i));
    }
}
