package day14_ForWhileDoWhile;

import java.util.Scanner;

public class C10_DoWhile {
    public static void main(String[] args) {

        int sayi = 1;
        do {
            System.out.println("Hello world");
            sayi--;
        }
        while (sayi == 0);

        // sıfır girilene kadar verilen sayıları toplayan kodu yazalım (do- while)

        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;

        do {
            System.out.println("Toplanacak sayıyı girin... Çıkmak için 0'a basınız..");
            girilenSayi = scanner.nextInt();
            toplam+=girilenSayi;

        } while (girilenSayi!=0);

        System.out.println("toplam = " + toplam);
    }
}
