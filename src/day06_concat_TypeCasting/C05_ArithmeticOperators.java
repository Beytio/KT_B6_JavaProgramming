package day06_concat_TypeCasting;

public class C05_ArithmeticOperators {
    public static void main(String[] args) {
        /*
        İşlem Önceliği
        1. () parantez
        2. *, /, mod(%)
        3. +, -
        Not: aynı öncelikli işlemler aynı satırda ise önce soldaki işlem yapılır.
         */

        int x=5;
        int y=2;
        int sonuc= x+y*x-3;
        System.out.println("sonuc = " + sonuc);

        System.out.println(sonuc+" "+x+x*y);
        //12+" "+5+10

        int sayi=3+5/2;

        System.out.println("sayi = " + sayi);

        sayi=10%151;
        System.out.println("sayi = " + sayi);


        sayi=sayi+1;

        System.out.println("sayi = " + sayi);

        sayi=sayi%3;
        System.out.println("sayi = " + sayi);

        int num=3+5/2*4%(12-9);
        //3+5/2*4%3
        //3+2*4%3
        //3+8%3
        //3+2
        //5

        System.out.println("num = " + num);

        double num1=3+(double)5/2*4%(12-9);
        //3+(double)5/2*4%3
        //3+2.5*4%3
        //3+10%3
        //3+1
        //4

        System.out.println("num1 = " + num1);
    }
}
