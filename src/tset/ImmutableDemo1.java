package tset;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
        public static void main(String[] args) {
            List<Integer> list = List.of(1, 2, 3, 4);
            for (Integer integer : list) {
                System.out.println(integer);
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            Iterator<Integer> it = list.iterator();
            do {
                System.out.println(it.next());
            } while (it.hasNext());
        }
    }
