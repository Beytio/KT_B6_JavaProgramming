package day25_Review;

import java.util.Scanner;

public class C01_Initials {
    public static void main(String[] args) {
        //  initials();
          initials("Murat","Boz");
    }

    //girilen isim ve soyismin ilk harflerini aralarında . koyarak yazdıran metodu yapalım
    //Neziha Sarı   N.S.
    //Kullanıcı küçük harfle girse bile sonuç büyük harf olsun


    public static void initials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Adınızı giriniz");
        String ad = scanner.nextLine();
        System.out.println("Lütfen Soyadınızı giriniz");
        String soyad = scanner.nextLine();

        ad = ad.toUpperCase();
        soyad = soyad.toUpperCase();

        char ilkAd = ad.charAt(0);
        char ilkSoyad = soyad.charAt(0);

        System.out.println(ilkAd+"."+ilkSoyad+".");
    }

    public static void initials(String ad, String soyad ) {
        ad = ad.toUpperCase();
        soyad = soyad.toUpperCase();

        char ilkAd = ad.charAt(0);
        char ilkSoyad = soyad.charAt(0);

        System.out.println(ilkAd+"."+ilkSoyad+".");
    }

}
