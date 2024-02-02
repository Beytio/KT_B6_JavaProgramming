package day29_StringPracticeCont;

import java.util.Scanner;

public class C05_Palindrome {
    public static void main(String[] args) {

        /*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.nextLine();


        String str2="";
// elma---> amle

        for (int i = str.length()-1; i >=0 ; i--) {
            str2 += str.charAt(i);
        }
        //System.out.println(str);
        //System.out.println(str2);

        boolean isPalindrome = str.equalsIgnoreCase(str2);
        System.out.println(isPalindrome);


    }
}
