package day09_OperatorsCont;

import java.util.Scanner;

public class C05_SayininRakamlarToplami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayi giriniz");
        int number=scanner.nextInt();//352

        int lastDigit=number%10;//2
        number=number/10;// 35

        int secondDigit=number%10;//5

        int thirdDigit=number/10;// 3

        int result=lastDigit+secondDigit+thirdDigit;
        System.out.println("result = " + result);


    }
}
// Kullanicidan 3 basamakli bir sayi alin
// ve sayinin rakamlari toplamini ekrana yazdirin!
//112   = 1 + 1 + 2 = 4
//952   = 9 + 5 + 2 = 16