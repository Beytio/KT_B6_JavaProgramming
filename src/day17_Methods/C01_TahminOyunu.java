package day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C01_TahminOyunu {
    public static void main(String[] args) {
        // Bilgisayarın tuttuğu 0 dahil-50 arası
        // sayısıyı 5 hamlede bulma
        // tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
        //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı

        Random random=new Random();
        int sayi= random.nextInt(50);

        //int sayi=23;

        Scanner scanner=new Scanner(System.in);

        int hak=1;

        while (hak<=5) {
            System.out.println(hak+". Tahmin : ");
            int tahmin = scanner.nextInt();

            if (tahmin>sayi && hak!=5){
                System.out.println("Aşağı");
            } else if (tahmin<sayi && hak!=5) {
                System.out.println("Yukarı");
            }else if(tahmin==sayi){
                System.out.println("Tebrikler doğru tahmin");
                break;
            }

            hak++;

            if (hak==6){
                System.out.println("Malasef bilemedin tutuğum sayi : "+sayi);
            }
        }
        System.out.println("hak = " + hak);

    }

}
