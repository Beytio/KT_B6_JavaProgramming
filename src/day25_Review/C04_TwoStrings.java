package day25_Review;

import java.util.Locale;

public class C04_TwoStrings {
    public static void main(String[] args) {

        String ad = "belMA";
        String soyad = "humuS";

        isimSoyisimDuzenle(ad, soyad);
        isimSoyisimDuzenle_2(ad, soyad);


    }

    //iki kelime girilsin... bu kelimelerin ilk harfi ne girilirse girilsin buyuğe çevrilsin
    //geri kalan kısmı küçük harfli olsun.. sonra bunlar ortada boşluk bırakılarak yazdırılsın
    //  mUstafa kaZımaZ  --> Mustafa Kazımaz

    public static void isimSoyisimDuzenle(String isim, String soyisim) {
        String ilkHarfIsim = isim.substring(0, 1).toUpperCase();
        String ilkHarfSoyisim = soyisim.substring(0, 1).toUpperCase();

        String geriKalanIsim = isim.substring(1).toLowerCase();
        String geriKalanSoyisim = soyisim.substring(1).toLowerCase();

        System.out.println(ilkHarfIsim + geriKalanIsim + " " + ilkHarfSoyisim + geriKalanSoyisim);

    }

    public static void isimSoyisimDuzenle_2(String isim, String soyisim) {
        String result =
                isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        System.out.println( result);
    }
}
