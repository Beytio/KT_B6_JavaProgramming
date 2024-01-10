package day13_ForLoops;

import java.util.Scanner;

public class C05_NameOfMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz 1-12 arasında :");
        int sayi=scanner.nextInt();
        String result="";


        if (sayi>=1 && sayi<=12){
            if (sayi==1){
                result="Ocak";
            } else if (sayi==2) {
                result="Şubat";
            }else if (sayi==3) {
                result="Mart";
            }else if (sayi==4) {
                result="Nisan";
            }else if (sayi==5) {
                result="Mayıs";
            }else if (sayi==6) {
                result="Haziran";
            }else if (sayi==7) {
                result="Temmuz";
            }else if (sayi==8) {
                result="Ağustos";
            }else if (sayi==9) {
                result="Eylül";
            }else if (sayi==10) {
                result="Ekim";
            }else if (sayi==11) {
                result="Kasım";
            }else if (sayi==12) {
                result="Aralık";
            }


        }else {
            result="Geçersiz ay numarası";
        }


        System.out.println(result);




    }
}
