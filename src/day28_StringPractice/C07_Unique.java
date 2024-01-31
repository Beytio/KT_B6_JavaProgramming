package day28_StringPractice;

public class C07_Unique {

    public static void main(String[] args) {
        /*
        3. Write a program that can return the unique characters from a String

        Ex:
        input:
        AABCCD

        output:
        BD
        */

        String str = "ADABCCD";

        //lastIndexOf ile indexOf eşit ise----> o char'dan 1 adet olduğunu gösterir.


        System.out.println("str.indexOf(\"D\") = " + str.indexOf("D"));
        System.out.println("str.lastIndexOf(\"D\") = " + str.lastIndexOf("D"));

        System.out.println("str.indexOf(\"B\") = " + str.indexOf("B"));
        System.out.println("str.lastIndexOf(\"B\") = " + str.lastIndexOf("B"));

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        System.out.println(result);

    }


}

