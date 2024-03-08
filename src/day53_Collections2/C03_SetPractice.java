package day53_Collections2;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        System.out.println("list = " + list);
        System.out.println("list.get(5) = " + list.get(5));

        System.out.println("----------------------");

        Set<Integer> hasSet=new HashSet<>();  // no duplşcates --  order random
        hasSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        hasSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        hasSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        hasSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        System.out.println("hasSet = " + hasSet);

       // hasSet.get(0);   index yoktur

        Set<Integer> linkedHashset=new LinkedHashSet<>();// no duplicates -- preserve order
        linkedHashset.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        linkedHashset.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        linkedHashset.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        linkedHashset.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        System.out.println("linkedHashset = " + linkedHashset);

       // linkedHashset.get(0);  index yoktur

        System.out.println("linkedHashset.size() = " + linkedHashset.size());
        System.out.println("list.size() = " + list.size());

        System.out.println("----------------------------");


        Set<Integer> treeSet= new TreeSet<>();
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        System.out.println("treeSet = " + treeSet);
        System.out.println("treeSet.size() = " + treeSet.size());
        // treeSet.get(0);  index yok



    }
}
