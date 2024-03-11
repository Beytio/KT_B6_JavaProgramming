package day56_LoopsAndMap;

import java.util.HashSet;
import java.util.Set;

public class C02_LoopsSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(6);
        set.add(16);
        set.add(37);
        set.add(18);
        set.add(19);

        // 25 den küçük olanları çıkar

        System.out.println("set = " + set);

//        for (Integer i : set){      // bu şekilde yaparsak hata alırız...
//            if (i<25){
//                set.remove(i);
//            }
//        }

        Set<Integer> set1 = new HashSet<>();

        for (Integer i : set) {
            if (i >= 25) {
                set1.add(i);
            }
        }

        System.out.println("set1 = " + set1);
        System.out.println("set = " + set);
    }
}
