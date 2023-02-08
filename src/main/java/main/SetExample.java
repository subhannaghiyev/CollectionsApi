package main;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // HashSet is *unique*, for example, if we type Subhan 10 times, if we enter a new name, it will cover it 1 time
        List<String> list = new ArrayList<>();
        list.add("Subhan");
        list.add("Subhan");
        list.add("Subhan");
        list.add("Subhan");
        list.add("Hasan");
        list.add("Hasan");
        list.add("Hasan");
        list.add("Hasan");
        list.add("Xanlar");
        list.add("Xanlar");
        list.add("Xanlar");
        list.add("Xanlar");

        Set<String> s = new HashSet<>(list); // unique
        for (String a: s) {
            System.out.println(a);
        }
       // TreeSet sorts like TreeMap...
        Set<Integer> set = new TreeSet<>();
        set.add(99);
        set.add(3);
        set.add(10);
        set.add(1);
        for (Integer i :set) {
            System.out.println(i);
        }
    }
}
