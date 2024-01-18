package day19_ReturnMethodsAndMethodOverloading;

public class C05_MethodCalling {
    public static void main(String[] args) {
        // soru : yarı çapı 8 olan daire ile 4 faktoryelin toplamı kaçtır...

        double daireAlan = C04_DaireAlan.daireAlan(8);
        int faktoryel = C03_Faktoriyel.faktoryelHesaplama(4);

        double sonuc = daireAlan + faktoryel;

        System.out.println("sonuc = " + sonuc);

        String name = "Ahmet";
        // ismi büyük harfle yaz
        System.out.println("name = " + name);
        name = name.toUpperCase();

        System.out.println("name = " + name);
    }
}
