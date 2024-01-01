package day06_concat_TypeCasting;

public class C01_VariableTypes {
    public static void main(String[] args) {

        // eğer bir data birden fazla kere kullanılacaksa onu bir variable atayarak kullanmak gerekir.

//        double KDVliFiyat=200*1.2;
//        double urun2=300*1.2;
//        double urun3=500*1.2;
//        double urun4=800*1.2;
//        double urun5=10000*1.2;

        double kdvOran = 1.3;

        double KDVliFiyat = 200 * kdvOran;
        double urun2 = 300 * kdvOran;
        double urun3 = 500 * kdvOran;
        double urun4 = 800 * kdvOran;
        double urun5 = 10000 * kdvOran;

        String name;   // Stringler mutlaka "" içerinde tanımlanması gerekir.
        name = "İhsan";

        System.out.println(name + " Antalyalıdır.");
        System.out.println(name + " kursiyerdir.");
        System.out.println(name + " evlidir.");

        name = "Özlem";
        System.out.println(name + " Antalyalıdır.");
        System.out.println(name + " kursiyerdir.");
        System.out.println(name + " evlidir.");

        String addres = "Beylikduzu / İst";

        int i = 1;
        byte b = 1;
        short s = 1;
        long l = 1;
        double d = 1.0;
        float f = 1.0f;

        byte b1 = 127;

        char ch = 'a';
        System.out.println("ch = " + ch);
        char ch1 = 97;
        System.out.println("ch1 = " + ch1);

        int arabaYasi=2016;
        int takvimYili=2024;

        boolean bl=  (takvimYili-arabaYasi)>5;
        System.out.println("bl = " + bl);

    }
}
