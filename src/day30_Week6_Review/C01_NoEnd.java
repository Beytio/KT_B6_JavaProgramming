package day30_Week6_Review;

public class C01_NoEnd {

    public static void main(String[] args) {

        /*
        Verilen kelimenin son harfini çıkarıp yazdıran bir program
        İnput: İncir
        Output: İnci

        */

        // String: sequence of chars
        // Char: 1 karakteri temsil eder

        String str= "İncir";
                   //01234

        System.out.println("str.substring(0,1) = " + str.substring(0, 1));
        System.out.println("str.substring(0,2) = " + str.substring(0, 2));
        System.out.println("str.substring(3,4) = " + str.substring(3, 4));
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));

        System.out.println("str.substring(2) = " + str.substring(2));

        System.out.println("str.substring(0,4) = " + str.substring(0, 4));

        System.out.println(noEnd("Java"));
        System.out.println(noEnd("C#"));

    }

    public static String noEnd(String str){

        return str.substring(0,str.length()-1);
    }







}
