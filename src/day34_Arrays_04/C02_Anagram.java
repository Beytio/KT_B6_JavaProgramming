package day34_Arrays_04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Anagram {
    public static void main(String[] args) {

        System.out.println("isAnagram(\"ilk\",\"kil\") = " + isAnagram("ilk", "kil"));
        System.out.println("isAnagram(\"adam\",\"dama\") = " + isAnagram("adam", "dama"));
        System.out.println("isAnagram(\"adam\",\"dam\") = " + isAnagram("adam", "dam"));

    }

    // girilen iki kelime anagram is true değilse false döndüren metodu yazalım
    //ilk  kil   true
    //adam dama  true
    //adam dam   false
    //adam  madam  false

    public static boolean isAnagram(String str1, String str2){
        char [] str1Chars =str1.toCharArray();
        char [] str2Chars =str2.toCharArray();

//        System.out.println(Arrays.toString(str1Chars));
//        System.out.println(Arrays.toString(str2Chars));

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

//        System.out.println(Arrays.toString(str1Chars));
//        System.out.println(Arrays.toString(str2Chars));

        boolean result = Arrays.equals(str1Chars,str2Chars);

        return result;
    }
}
