package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //1. scanner obje oluştur
        Scanner scan=new Scanner(System.in);

        //2. kullanıcıyı bilgilendir! ne istediğinizi söyleyin
        System.out.println("Lütfen isminizi giriniz: ");

        //3. Girilen veriyi içene koyabileceğiniz uygun bir değişken oluşturn
        String name=scan.nextLine();
        // scan.next()  ---> ilk boşluğa kadar alır
        // scan.nextLine()  ---> ilk enter a kadar alır

        System.out.println("Isminiz :"+name);

        //4 close scanner
        scan.close();
    }
}
