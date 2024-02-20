package day41_encapsulation_and_staticKeyword;

import java.util.Arrays;

public class C06_BankaMusterisiTest {
    public static void main(String[] args) {
        System.out.println(C05_BankaMusterisi.bankaAdi);

        C05_BankaMusterisi  musteri_1 = new C05_BankaMusterisi();

        musteri_1.setAdSoyad("Hasan Karakaya");
        musteri_1.setHesapNo();

        C05_BankaMusterisi  musteri_2 = new C05_BankaMusterisi();

        musteri_2.setAdSoyad("Necla Sarı");
        musteri_2.setHesapNo();

        musteri_1.paraYatirma(1500);
        musteri_1.paraYatirma(2500);

        musteri_2.paraYatirma(500);
        musteri_2.paraYatirma(500);
        musteri_2.paraYatirma(500);

        musteri_1.paraCekme(1000);

        System.out.println(musteri_1.getBakiye());

        System.out.println("musteri_1 = " + musteri_1);
        System.out.println("musteri_2 = " + musteri_2);

        musteri_2.paraCekme(2000);
        musteri_1.paraCekme(2000);

        System.out.println("musteri_1 = " + musteri_1);
        System.out.println("musteri_2 = " + musteri_2);

        musteri_1.paraYatirma(580000);
        musteri_1.paraYatirma(680000);

        musteri_1.bakiyeKontrol();
        musteri_2.bakiyeKontrol();

        System.out.println("musteri_1 = " + musteri_1);
        System.out.println("musteri_2 = " + musteri_2);


    }
}
