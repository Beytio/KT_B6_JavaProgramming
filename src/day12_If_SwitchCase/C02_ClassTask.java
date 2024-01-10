package day12_If_SwitchCase;

import java.util.Scanner;

public class C02_ClassTask {
    public static void main(String[] args) {
          /*
        task
2 adet vize notu alin
bir adet final notu alın
vizeler ortalamaya %20 etki ediyor
final ise %60 etki ediyor
ortalamayı hesaplayın
geçme notunu yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("1. vize notunu giriniz :");
        double vize1= scan.nextDouble();
        System.out.println("2. vize notunu giriniz :");
        double vize2= scan.nextDouble();
        System.out.println("Final notunu giriniz :");
        double finalNotu= scan.nextDouble();

        double ort=(vize1+vize2)*0.2+finalNotu*0.6;

        if(ort>=90 &&  ort<100){
            System.out.println("Geçme notu A");
        } else if (ort>=80&&  ort<90) {
            System.out.println("Geçme notu B");
        }else if (ort>=70&&  ort<80) {
            System.out.println("Geçme notu C");
        }else if (ort>=60&&  ort<70) {
            System.out.println("Geçme notu D");
        }else if (ort<60 && ort>=0 ){
            System.out.println("Geçmiş olsun kaldınız FFF");
        }else {
            System.out.println("Hatalı giriş yaptınız");
        }


        System.out.println("ortalamanız : "+ort);


    }
}
