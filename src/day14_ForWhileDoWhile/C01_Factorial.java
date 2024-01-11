package day14_ForWhileDoWhile;

import java.util.Scanner;

public class C01_Factorial {
    public static void main(String[] args) {
        // girilen pozitif tam sayının faktoryelini hesaplayalım
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen faktoryelini almak istediğiniz sayıyı giriniz");
        int sayi = scanner.nextInt();
        int fakroryel = 1;

        for (int i = 1; i <= sayi; i++) {
            fakroryel = fakroryel * i;   //faktoryel*=i;
        }
        System.out.println("fakroryel = " + fakroryel);
    }
}
// 5! = 5*4*3*2*1
// 4! = 1*2*3*4
// 7! = 5!*6*7
// 0! = 1

//  f:1 , i:1    f:1
//  f:1 , i:2    f:2
//  f:2 , i:3   f: 6
// f:6 , i:4    f:24
// f:24,  i:5   f:120