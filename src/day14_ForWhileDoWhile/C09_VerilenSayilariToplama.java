package day14_ForWhileDoWhile;

import java.util.Scanner;

public class C09_VerilenSayilariToplama {
    public static void main(String[] args) {
        // sıfır girilene kadar verilen sayıları toplayan kodu yazalım

        int toplam = 0;
        boolean bl = true;

        while (bl) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Toplanacak sayıyı girin... Çıkmak için 0'a basınız..");
            int girilenSayi = scanner.nextInt();
            if (girilenSayi != 0) {
                toplam += girilenSayi;
                System.out.println("toplam = " + toplam);
            } else {
                bl = false;
            }
        }

        System.out.println("Genel Toplam : " + toplam);
        System.out.println("-----------------------");

        //0 dan 100 e kadar olan çift sayıları yazdıralım (while)

        int sayi = 0;

        while (sayi<=100){
            System.out.print(sayi+" ");
            sayi+=2;   //sayi = sayi + 2;
        }
    }
}
