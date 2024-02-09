package day35_Week07_Review;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        int[] num1={5,78,46,42};
        for (int i = num1.length-2; i < num1.length; i++) {
            System.out.println(num1[i]+" ");
        }


        for (int a:num1 ) {
            System.out.println(a+" ");
        }

    }
}
