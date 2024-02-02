package day29_StringPracticeCont;

import java.util.Scanner;

public class C07_FormatFullName {

    public static void main(String[] args) {
        /*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "kRaFT"
                        lastName = "tECH"

                    output:
                        Kraft Tech

 */

        Scanner sc= new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();


//        String firstName= "kRaFT";
//        String lastName= "tECH";


//        firstName= (""+ firstName.charAt(0)).toUpperCase()+ firstName.substring(1).toLowerCase();
//        lastName= (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();

        firstName= (firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase());
        lastName= (lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase());

//        System.out.println(firstName);
//        System.out.println(lastName);
        System.out.println(firstName+" "+lastName);



    }





}
