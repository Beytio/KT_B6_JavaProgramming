package day36_WrapperClasses;

import java.util.Arrays;

public class C01_VarArgs {
    public static void main(String[] args) {

        System.out.println("sum(2,3,6,9,25) = " + sum(2, 3, 6, 9, 25));
        System.out.println("sum(2,9,21,22252,36,353,23) = " + sum(2, 9, 21, 22252, 36, 353, 23));
        int [] nums = {2,10,25};
        System.out.println("sum(nums) = " + sum(nums));

        concatStringsWithStars("Mehmet","Şadiye","Mevlüt","Fazıl");
    }

    public static int sum(int... sayilar) {
        int result = 0;
        System.out.println("sayilar.length = " + sayilar.length);
        for (int sayi : sayilar) {
            result += sayi;
        }
        return result;
    }


    public static void concatStringsWithStars(String...kelimeler){
        System.out.println("Arrays.toString(kelimeler) = " + Arrays.toString(kelimeler));
        String result = String.join("*",kelimeler);
        System.out.println("result = " + result);
    }
}
