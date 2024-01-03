package day07_ArithmeticOperators;

import java.util.*;


public class C06_ScannerIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi  ve soyadınızı giriniz :"  );
        String name = scan.nextLine();

        System.out.println("Girdiğiniz isim : " + name);


        System.out.println("---------------------");

        System.out.println("1. vize notunuzu giriniz : ");

        double firstVise=scan.nextDouble();

        System.out.println("2. vize notunuzu giriniz : ");

        double secondVise=scan.nextDouble();

        System.out.println("Final notunuzu giriniz : ");

        double finalNote=scan.nextDouble();

        double notOrtalamasi= firstVise*0.20 + secondVise*0.20 + finalNote*0.60;

        System.out.println(name+ " ders ortalamanız : "+notOrtalamasi);

    }
}
