package day55_Week11_Review;

import java.util.*;

public class C02_ListPractice {
    public static void main(String[] args) {
        List<Integer> numList=new LinkedList<>();// OOP Polymorphism
        numList.addAll(Arrays.asList(5,10,15,20,15,25,25));
        System.out.println("numList = " + numList);

        numList.add(8);
        System.out.println("numList = " + numList);


        Collections.sort(numList);
        System.out.println("numList = " + numList);

        numList.remove(numList.size()-1);
        System.out.println("numList = " + numList);

        numList.removeAll(Arrays.asList(15));
        System.out.println("numList = " + numList);


        System.out.println("----------------");

        List<Integer> numlist2=new Vector<>();
        numlist2.addAll(Arrays.asList(5,10,15,20,15,25,25));
        System.out.println("numlist2 = " + numlist2);

        numlist2.add(8);
        System.out.println("numlist2 = " + numlist2);
        Collections.sort(numlist2);
        System.out.println("numlist2 = " + numlist2);

        numlist2.remove(numlist2.size()-1);
        System.out.println("numlist2 = " + numlist2);

        numlist2.retainAll(Arrays.asList(15));
        System.out.println("numlist2 = " + numlist2);


        System.out.println("------------------List to Set----------------");

        List<Integer> list=new LinkedList<>();// OOP Polymorphism
        list.addAll(Arrays.asList(5,10,15,20,15,25,25));
        System.out.println("list = " + list);

        Set<Integer> set=new HashSet<>(list);
        System.out.println("set = " + set);

        Set<Integer> set1=new TreeSet<>(list);
        System.out.println("set1 = " + set1);


        //  List<Integer> list=new List<>();
    }
}
