package day58_JavaReview;

import java.util.Arrays;

public class C06_Anagram {
    public static void main(String[] args) {
        String str1= "kitapa";
        String str2= "katipa";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars2));

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars2));

       boolean bl = Arrays.equals(chars1,chars2);
        System.out.println(bl);
    }
}
