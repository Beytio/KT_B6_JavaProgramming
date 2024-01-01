package day06_concat_TypeCasting;

public class C03_WideningCasting {
    public static void main(String[] args) {

        byte b=25;
        short s;
        s=b;
        System.out.println("s = " + s);

        int i=s;

        System.out.println("i = " + i);

        long l=i;

        System.out.println("l = " + l);

        double d=l;
        System.out.println("d = " + d);

        int sayi=10/3;

        System.out.println("sayi = " + sayi);

        String str="Ahmet";
      //  double db=str;  //olmaz çünkü bu data tipleri dönüşemez.

        char c='A';
        char c1='B';
        int toplam=c+c1;

    }
}
