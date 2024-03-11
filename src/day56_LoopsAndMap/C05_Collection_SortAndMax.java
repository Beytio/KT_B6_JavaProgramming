package day56_LoopsAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_Collection_SortAndMax {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(35);
        nums.add(6);
        nums.add(16);
        nums.add(37);
        nums.add(18);
        nums.add(19);

        System.out.println("nums = " + nums);

        Collections.sort(nums);  // mevcut listeyi değiştirir.

        System.out.println("nums = " + nums);

        System.out.println("nums.get(nums.size()-1) = " + nums.get(nums.size() - 1));

        System.out.println("Collections.max(nums) = " + Collections.max(nums));

        Collections.shuffle(nums);  // elemanların yerlerini karıştırır.

        System.out.println("nums = " + nums);

       // Collections.   classı bize bazı kolaylıklar sağlayan metodlar verir.

    }
}
