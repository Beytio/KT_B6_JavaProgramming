package day30_Week6_Review;

import java.util.Scanner;

public class C07_Retrieve {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        //String str = "mn@#123Ab!";
        String letters = "";
        String digits = "";
        String specialChars = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //System.out.print(ch+" ");//m n ..... !
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                letters += ch;
            } else if (ch >= 48 && ch <= 57) {
                digits += ch;
            }
            else {
                specialChars +=ch;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
