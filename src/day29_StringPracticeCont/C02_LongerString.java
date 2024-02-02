package day29_StringPracticeCont;

import java.util.Scanner;

public class C02_LongerString {
    public static void main(String[] args) {
        /*
        Scanner'dan 2 kelime alıp, daha uzun olanı yazdıracağız
         */

        Scanner input = new Scanner(System.in);
        System.out.println("birinci kelimeyi giriniz.");
        String str1 = input.nextLine();
        System.out.println("ikinci kelimeyi giriniz.");
        String str2 = input.nextLine();
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 > length2) {
            System.out.println(str1 + " daha uzun bir kelime");
        } else if (length2 > length1) {
            System.out.println(str2 + " daha uzun bir kelime");
        } else {
            System.out.println(str1 + " ve " + str2 + " eşit uzunlukta");
        }

    }
}
