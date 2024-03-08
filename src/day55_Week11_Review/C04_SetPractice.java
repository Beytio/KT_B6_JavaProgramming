package day55_Week11_Review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_SetPractice {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();// no duplicates, no index --- random order
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(12);
        set.add(34);
        set.add(-12);
        set.add(9);

        System.out.println("set = " + set);


        // 1. Yöntem
        for (int i : set) {
            System.out.println(i);
        }


        // 2. Yöntem  -- arrayliste dönüştürmek
        List<Integer> list=new ArrayList<>(set);
        System.out.println("list = " + list);

        System.out.println("list.get(3) = " + list.get(3));


        // 3. Yöntem  -- array e dönüştürmek
        Integer[] arr=set.toArray(new Integer[0]);
        System.out.println("arr[3] = " + arr[3]);


    }
}
