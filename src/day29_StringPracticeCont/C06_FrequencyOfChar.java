package day29_StringPracticeCont;

import java.util.Scanner;

public class C06_FrequencyOfChar {

    public static void main(String[] args) {
       /*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a char");
        char ch = sc.next().charAt(0);

        //String str="İstanbul Osmanlının başkenti idi";
        //char ch= 'i';

        int countOfChar= 0;

        for (int i = 0; i <= str.length()-1 ; i++) {
            if(str.charAt(i)==ch ){
                countOfChar +=1;
            }

        }
        System.out.println(countOfChar);


    }
}
