package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C03_ArrayList_2 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(3,98,25,39,25));

        System.out.println("numberList = " + numberList);

        Collections.sort(numberList);

        System.out.println("numberList = " + numberList);

    }
}
