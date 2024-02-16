package day40_WeekReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C03_MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,12,34,56,32,0));

        System.out.println(numList);

        Integer max = Collections.max(numList);
        System.out.println(max);

        System.out.println("---------");

        Collections.sort(numList);
        System.out.println(numList);

        System.out.println(numList.get(numList.size()-1));


    }
}
