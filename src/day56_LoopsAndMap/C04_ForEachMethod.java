package day56_LoopsAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_ForEachMethod {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(6);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);

        // 25 den küçük olanları çıkar

        set.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("-----------------");

        List<Integer> list = new ArrayList<>();
        set.forEach(x -> list.add(x));
        System.out.println("list = " + list);


        System.out.println("-----------------");
        System.out.println("set = " + set);

        set.removeIf(element -> element < 25);

        System.out.println("set = " + set);

        //stream methods
        List<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(35);
        nums.add(6);
        nums.add(6);
        nums.add(6);
        nums.add(6);
        nums.add(16);
        nums.add(37);
        nums.add(37);
        nums.add(18);
        nums.add(19);
        nums.add(19);

        long count = nums.stream().distinct().count();
        System.out.println("count = " + count);

        nums.forEach(element -> {
            if (element > 25)
                System.out.println(element * 10);
        });

    }
}
