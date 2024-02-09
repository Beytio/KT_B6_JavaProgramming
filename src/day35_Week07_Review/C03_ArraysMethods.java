package day35_Week07_Review;

import java.util.Arrays;

public class C03_ArraysMethods {
    public static void main(String[] args) {
        int [] nums={1,5,0,78,46};

        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        Arrays.fill(nums, 0);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        Arrays.fill(nums,0,2,5);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

       int [] copyNum=Arrays.copyOf(nums,3);
        System.out.println("Arrays.toString(copyNum) = " + Arrays.toString(copyNum));

        System.out.println("Arrays.equals(nums,copyNum) = " + Arrays.equals(nums, copyNum));

        copyNum=Arrays.copyOfRange(nums,0,2);
        System.out.println("Arrays.toString(copyNum) = " + Arrays.toString(copyNum));

        copyNum=Arrays.copyOfRange(nums, nums.length-2,nums.length);
        System.out.println("Arrays.toString(copyNum) = " + Arrays.toString(copyNum));



        int[]num1={2,7,11,22,37};
        int[]num2={2,7,34,45,37};

        int mismatchIndex=Arrays.mismatch(num1,num2);
        System.out.println("mismatchIndex = " + mismatchIndex);


    }
}
