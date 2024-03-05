package day52_collections;

import java.util.*;

public class C01_CollectionsIntro {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(6);
        list.add(6);
        list.add("Ali");
        list.add(new Scanner(System.in));
        list.add(new ArrayList<>(Arrays.asList(2,3,8)));
        list.add(false);

        System.out.println("list = " + list);

        Object [] objects = new Object[6];
        objects[0] = 6;
        objects[1] = 6;
        objects[2] = "Ali";
        objects[3] = new Scanner(System.in);
        objects[4] = new ArrayList<>(Arrays.asList(2,3,8));
        objects[5] = false;

        System.out.println("objects.length = " + objects.length);

        System.out.println(Arrays.toString(objects));

        System.out.println("list.get(1) = " + list.get(1));

     //   List<String>  list2 = new List<>();  inteface olduğu için obje üretemeyiz...
        List<Integer> list2 = new ArrayList<>();  //polymorphism  // çok biçimlilik

        list2.add(10);
        list2.add(20);
        list2.add(40);
        list2.add(100);
        list2.add(500);

        System.out.println("list2.get(0) = " + list2.get(0));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(2,23,25,88,74));

        System.out.println("linkedList.get(2) = " + linkedList.get(2));


    }
}
