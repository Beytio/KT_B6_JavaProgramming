package day35_Week07_Review;

import java.util.Arrays;

public class C09_DecendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 76, 42, 3, 14};

        Arrays.sort(numbers);// 3 , 5, 9, 14, 42, 76

        int [] reverseArr=new int[numbers.length];

        for (int i = numbers.length-1,j=0; i >= 0; i--, j++) {
            reverseArr[j]=numbers[i];
        }

        System.out.println("Arrays.toString(reverseArr) = " + Arrays.toString(reverseArr));
    }
}
