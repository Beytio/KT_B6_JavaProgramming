package day40_WeekReview;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_CombibeArray {
    public static void main(String[] args) {
        String [] arr1={"A","B","C"};
        String [] arr2={"D","E", "G", "F"};

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.addAll(Arrays.asList(arr1));
        System.out.println(arrayList);
        arrayList.addAll(Arrays.asList(arr2));
        System.out.println(arrayList);


    }
}
