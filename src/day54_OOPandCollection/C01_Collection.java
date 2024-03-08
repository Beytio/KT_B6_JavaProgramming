package day54_OOPandCollection;

import java.util.*;

public class C01_Collection {
    public static void main(String[] args) {
     int n=5;
    // int [] nums=new int[5];

        /*

        Collection <Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(4);
        nums.add(5);
        nums.add(9);
        nums.add(9);
        nums.add(9);
        nums.add(9);
      //  nums.add("9");



        System.out.println("nums = " + nums);

        for(int n:nums){
            System.out.println(n);
        }


      */

        Set <Integer> nums = new TreeSet<>();
        nums.add(6);
        nums.add(4);
        nums.add(5);
        nums.add(9);
        nums.add(9);
        nums.add(92);
        nums.add(95);
        nums.add(999);
        nums.add(999);
        nums.add(999);
        nums.add(999);
        nums.add(999);
        nums.add(45);


        System.out.println("nums = " + nums);

    }
}
