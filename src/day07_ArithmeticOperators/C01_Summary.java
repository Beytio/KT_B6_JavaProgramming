package day07_ArithmeticOperators;

public class C01_Summary {
    public static void main(String[] args) {
        //  toplama, çıkarma, çarpma, bölme ve mod alma
        //öncelik sırası
        // 1. () parantez içi
        // 2. *, / ve mod alma (%)
        //3. + , - işlemleri

        //not : aynı öncelik sırasına sahip işlemlerde önce soldaki yapılır.

        // Stringlerde ekleme işlemi ne ile yapılır? + operatorü ile yapılır..
        //Stringe eklenen data neye dönüşür? String'e dönüşür...

        double db = (double) 99 / 25;

        String sonuc = "Ahmet " + db + " Yılmaz";

        System.out.println(sonuc);

        int sonucBoy=sonuc.length();
        System.out.println("sonucBoy = " + sonucBoy);

        String str = "Ali";
        int strBoy = str.length();
        System.out.println("strBoy = " + strBoy);

        System.out.println("---------------------------");

        short s=6;
        short s1=6;
        short result;


       // result=(short) s+s1;  hata verir.
        result=(short) (s+s1);  //doğrusu budur.

        int a=10;
        int b=20;

        String k="Merhab"+"a"+a+b;
        System.out.println(k);
        //"Merhaba10"+20
        //"Merhaba1020"

        String j=a+b+"Merh"+"ab"+a+"a";
        System.out.println(j);

    }
}
