package day19_ReturnMethodsAndMethodOverloading;

public class C07_MethodOverloading {
    public static void main(String[] args) {
        // kenarı 5 olan karenin ve kısa kenarı 5 uzun kenarı 8 olan dikdörtgenin ve yarı çapı 6 olan dairenin
        // alanları toplamı kaçtır.

        double kareAlan=alan(5);
        double dikdortgenAlan=  alan(5,8);
        double daireAlan= alan(6.0);

        double toplam= kareAlan+dikdortgenAlan+daireAlan;
        System.out.println("toplam = " + toplam);

    }

    /*
    kare, diktörtgen ve dairenin alanlarını hesaplayan metodları yazınız (overloading)
     */

    public static double alan(int kenarUzunlugu){
        return kenarUzunlugu*kenarUzunlugu;
    }

    public static double alan(byte kenarUzunlugu){
        return kenarUzunlugu*kenarUzunlugu;
    }

    public static double alan (int kisaKenar, int uzuKenar){
        return  kisaKenar*uzuKenar;
    }

    public static double alan (double yariCap){
        return Math.PI*yariCap*yariCap;
    }

}
