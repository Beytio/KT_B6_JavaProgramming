package day08_ScannerAndOperators;


import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {
//      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
//		Isminiz : Himmet
//		Soyisminiz : Abi
//		Yasiniz : 38
//      Dogum Yeriniz : Kayseri
//		Kaydiniz basariyla tamamlanmistir.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz : ");

        String name=scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz : ");

        String lastName=scanner.nextLine();

        System.out.println("Lütfen yaşinizi giriniz : ");

        int age=scanner.nextInt();
        scanner.nextLine(); // enter için konuldu

        System.out.println("Lütfen doğum yerinizi giriniz : ");

        String birthPlace=scanner.nextLine();

        System.out.println("İsminiz :"+name );
        System.out.println("Soyisminiz :"+lastName );
        System.out.println("Yaşiniz :"+age );
        System.out.println("Dogum yeriniz :"+birthPlace );
        System.out.println("Kaydiniz basariyla tamamlanmistir.");


    }
}
