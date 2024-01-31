package day28_StringPractice;

import java.util.Scanner;

public class C04_ReplaceX {

    public static void main(String[] args) {
/*
Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */


        //String word = "xcodex";

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");

        String word = input.nextLine();

//        if(word.charAt(0)=='x'){
//            word=word.replaceFirst("x","a");
//        }
//        System.out.println(word);

        System.out.println("-------------2.çözüm-------------");
        if(word.startsWith("x")){
            word=word.replaceFirst("x","a");
        }
        System.out.println(word);



    }
}
