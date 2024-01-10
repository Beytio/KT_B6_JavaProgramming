package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // if'in basit hali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int girilenSayi = scanner.nextInt();

        // eğer sayı çift ise "Sayı çifttir" yazalım
        // eğer sayı tek ise "Sayı tektir" yazalım

        if (girilenSayi % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else {
            System.out.println("Sayı tektir.");
        }


        System.out.println(girilenSayi % 2 == 0 ? "Sayı çifttir." : "Sayı tektir.");




    }
}
