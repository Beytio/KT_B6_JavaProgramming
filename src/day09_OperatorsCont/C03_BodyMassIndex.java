package day09_OperatorsCont;

import java.util.Scanner;

public class C03_BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz :(Ornek : 1,82)");
        double boy=scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :(Ornek : 82,5)");
        double kilo=scanner.nextDouble();

        double bmi=kilo/(boy*boy);

        System.out.println("Kilonuz: "+ kilo);
        System.out.println("Boyunuz : "+boy);
        System.out.println("Beden kitle Endeksiniz : "+bmi);

    }
}
/*
 * Kullanicidan aldigimiz boy ve kiloda Beden Kitle Endeksi body mass index hesaplanacak
 *   Body Mass Index (bmi) = kilo / (Boy(m)*Boy(m))
 *
 * */