package day52_collections;

import java.util.*;

public class C03_List {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>(Arrays.asList(5,10,15,20,25));

        System.out.println("list1 = " + list1);

        list1.addAll(Arrays.asList(15,10,35,20,25,5,5));

        System.out.println("list1 = " + list1);  //list1 = [5, 10, 15, 20, 25, 15, 10, 15, 20, 25]

        System.out.println("list1.remove(5) = " + list1.remove(5)); //15

        System.out.println("list1 = " + list1); //list1 = [5, 10, 15, 20, 25, 10, 35, 20, 25]

        System.out.println("list1.removeAll(Arrays.asList(5)) = " + list1.removeAll(Arrays.asList(5)));//true

        System.out.println("list1 = " + list1);  //list1 = [10, 15, 20, 25, 10, 35, 20, 25]


        Set<Integer> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(1,1,1,2,2,2,2,2,2,5,5,5,3,3,3,14,14,14,9,93,9,8));

        System.out.println("set1 = " + set1);

        System.out.println("set1.add(5) = " + set1.add(5));
        System.out.println("set1.add(11) = " + set1.add(11));

        System.out.println("set1 = " + set1);

        Set<Integer> set2 = new TreeSet<>();   //sıralayarak elementleri kabul eder...içinde sıralıdır

        set2.addAll(Arrays.asList(1,1,1,2,2,2,2,2,2,5,5,5,3,3,3,14,14,14,9,93,9,8));

        System.out.println("set2 = " + set2);


        List<Integer> list2 = new Vector<>();   //synchronized ve thread safe
        list2.addAll(Arrays.asList(2,3,6,3,5));
        System.out.println("list2 = " + list2);  //list2 = [2, 3, 6, 3, 5]


        Stack<Integer> list3 = new Stack<>();  //LIFO
        list3.addAll(Arrays.asList(2,3,6,9));
        list3.push(3);
        list3.push(11);
        list3.push(0);

        System.out.println("list3 = " + list3);

        System.out.println("list3.remove(2) = " + list3.remove(2));

        System.out.println("list3 = " + list3); //list3 = [2, 3, 9, 3, 11, 0]

        System.out.println("list3.pop() = " + list3.pop());  //0

        System.out.println("list3 = " + list3); //list3 = [2, 3, 9, 3, 11]

        System.out.println("list3.peek() = " + list3.peek());  //11

        System.out.println("list3 = " + list3); //list3 = [2, 3, 9, 3, 11]

    }
}
