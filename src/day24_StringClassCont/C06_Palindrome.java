package day24_StringClassCont;

public class C06_Palindrome {
    public static void main(String[] args) {

        System.out.println("isPalindrome(\"kabak\") = " + isPalindrome("Kabak"));

        System.out.println("isPalindrome(atma) = " + isPalindrome("atma"));
        System.out.println("isPalindrome(\"123321\") = " + isPalindrome("123321"));

        System.out.println("isPalindrome(\"ey edip adanada pide ye\") = " + isPalindrome("ey edip adanada pide ye"));
    }

    //bir metod yazalım parametre olarak aldığı string palindrome ise true değilse false değer dönsün
    //kazak
    //anna
    //ey edip adanada pide ye
    //kayak

    public static boolean isPalindrome(String word){
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
           reverse+=word.charAt(i);
        }
        return word.equalsIgnoreCase(reverse);
    }
}
