/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 * @author subhan
 */
public class ListExample {

    public static void main(String[] args) {
        /*
        The difference between ArrayList and LinkedList is that !!
         It is easier to find in ArrayList because we can find it by typing index, but delete reduces performance because a new array
         creates and fills it.
         LinkedLIST - add & delete is convenient because the objects are connected one after the other and the search performance increases. hard to find
         because there is no index, the performance is poor...
        */
        Collection<String> coll = Collections.synchronizedCollection(new ArrayList<>());

        ArrayList<String> al = new ArrayList<>();
        al.trimToSize();
        al.add("Subhan");
        for (String s : al) {
            System.out.println(s);
        }
        System.out.println();
        List<Integer> i1 = new LinkedList<>();
        i1.add(5); // index - 0
        i1.add(6); // index - 1
        i1.add(7); // index - 2
        i1.add(8); // index - 3
        i1.remove(2);
        for (Integer i : i1) {
            System.out.println(i);
        }


        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        for (Integer f : arrayList) {
            System.out.println(f);
        }

        List<String> list = new LinkedList<>();
        list.add("Subhan");
        list.add("Hasan");
        list.add("Camal");
        list.add("Xanlar");
        for (String s1 : list) {
            System.out.println(s1);
        }

    }
}


