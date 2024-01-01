package day04_variables;

public class C01_PrimitiveDataTypes {

    public static void main(String[] args) {

        //boolean--- true ya da false değerini alır. true =1  , false =0' ı atar.
        boolean overEighteen = true;   //declaration and assign

        System.out.println(overEighteen);

        boolean isMarried;  //declaration
        isMarried = false;  //assign --initialization

        String str = "true";

        //tamsayılar
        //age değişkeni oluşturalım
        byte age;
        age = 30;
        System.out.println(30);
        System.out.println(age);

         age = 35;
         age = 39;

        int plaka;
        plaka = 65;

        plaka = age + 50;

        System.out.println(plaka);

        plaka = plaka + age;  // atama işlemi sağ taraf yapılır ve çıkan sonuç soldakine atanır.

        System.out.println(plaka);

        byte b=12;
        byte c=12;

        int toplam=b+c;
        int bolum=b/c;

        System.out.println(toplam);

        // byte, short ve int ile yapılan aritmetik işlemlerin sonucu daima int.

        //short
        short sh=30000;
        short sh1=10;

        int result=sh+sh1;

        //int
        int mySalary;
        mySalary=30_000;
        System.out.print("My salary is ");
        System.out.println(mySalary);

        System.out.println("My salary is "+mySalary);

        int i=11;
        int j=3;
        int k=i/j;

        System.out.println(k);

        //long
        long numberOfAnts=15_666_222_552_225L;
        System.out.println(numberOfAnts);

        //ondalıklı sayılar
        //float
        float fl=15.58f;
        float fl1=15.658f;

        float sonuc=fl-fl1;
        System.out.println(sonuc);

        //double
        double fiyat=87.99;
        double fiyat1=81.99;
        double fiyat2=103.99;
        double fiyat3=103.99;

        double sepetToplami=fiyat1+fiyat+fiyat3-fiyat2;
        System.out.println(sepetToplami);

    }
}
