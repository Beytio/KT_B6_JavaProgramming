package day52_collections;

import java.util.*;

public class C02_Collections {
    public static void main(String[] args) {
        /**
         *  Collection nesneleri bir arada tutan yapılara denir.
         *  Karşılaşılan durumlara göre farklı collection yapısı kullanabiliriz.
         *
         *  1- List
         *  2- Queue
         *  3- Set
         */

    //    List<String> coll1 = new List<>();  // interface olduğu için obje üretemeyiz
        List<String> coll1 = new ArrayList<>();
        ArrayList<String> coll11 = new ArrayList<>();
        List<Object> coll2 = new LinkedList<>();
        Queue <Integer> coll3 = new LinkedList<>();
        Queue<String > coll4 = new PriorityQueue<>();

        List<String> coll5 = new Vector<>();
        List<String> coll6 = new Stack<>();


        ((Stack) coll6).push(5);
        ((Stack) coll6).push(51);
        ((Stack) coll6).push(15);
        ((Stack) coll6).push(50);
        ((Stack) coll6).push(18);

        System.out.println(coll6);

        ((Stack) coll6).pop();

        System.out.println(coll6);


        System.out.println("((Stack) coll6).peek() = " + ((Stack) coll6).peek());


        Set<String> coll7 = new HashSet<>();
        Set<String> coll8 = new TreeSet<>();
        Set<String> coll9 = new LinkedHashSet<>();


    }
}
