package day40_WeekReview;

import java.util.ArrayList;

public class C02_CombineArray2 {
    public static void main(String[] args) {

        String [] arr1={"A","B","C"};
        String [] arr2={"D","E", "G", "F"};

        ArrayList<String> arrayList=new ArrayList<>();

        for (String s : arr1) {
            arrayList.add(s);
        }
        System.out.println(arrayList);

        for (String s : arr2) {
            arrayList.add(s);
        }
        System.out.println(arrayList);


    }
}
