package day07_ArithmeticOperators;

import java.util.Scanner;

public class C05_ArithmeticOperators_2 {
    public static void main(String[] args) {
         /*
        60 soruluk bir sınavda 4 yanlış 1 doğruyu götürmektedir.
        Tüm sorulara cevap veren bir öğrencinin 51,25 neti
        olduğuna göre ,öğrenci kaç soruya yanlış yanıt vermiştir?
         */

        double soruSayisi=60;
        double netSayisi=48;
        double oran=5;

        // sadece bir soru yanlış yaparsam 60-1= 59 doğru sayısı
        // 1 yanlış 0,25 doğruyu götürür
        // net sayım 60- (1+1/4)  = 58,75

        // 3 yanlış yapan   60-3  = 57 doğru var
        // 3 yanlış 0,75 doğruyu götürür.
        // net sayım 60- (3+3/4) = 56,25   ---> net = soru sayisi- (yanlış+yanlış/4)

        //yanlış sayısı = (toplam soru- net)/(1+1/oran)

        double yanlisAdedi=(soruSayisi-netSayisi)/(1+1/oran);


        System.out.println("yanlisAdedi = " + yanlisAdedi);

        System.out.println("----------------------------");


        /*
        verilen herhangi bir üç basamaklı sayının rakam değerlerinin toplamını bulan kod nedir;
        örnek : 981  9+8+1=18
        örnek :126  1+2+6=9

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen basamakları toplanacak 3 basamaklı sayıyı giriniz : ");
        int sayi= scan.nextInt(); // her sayının 10 bölümünden kalan ilk basamak değeridir.

        int birinciBasamak=sayi%10;   //6

        sayi=sayi/10;  // sayi=85

        int ikinciBasamak =sayi%10;  //5

        sayi=sayi/10;  // sayi=8

        int ucuncuBasamak=sayi%10;  //8

        int basamaklarToplami=birinciBasamak+ikinciBasamak+ucuncuBasamak;

        System.out.println("basamaklarToplami = " + basamaklarToplami);
    }
}
