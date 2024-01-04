package day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin
        //Sayiya iki ekle ve karesini al yazdır
        Scanner scan=new Scanner(System.in);

        System.out.println("litfen isim giriniz");

        String name=scan.nextLine();

        System.out.println("Lütfen sayi giriniz: ");

        int num= scan.nextInt();

        System.out.println("girdiğiniz sayi = "+num);

        System.out.println("Girdiğiniz sayinin 2 fazlasinin karesi= "+(num+2)*(num+2));
    }
}
