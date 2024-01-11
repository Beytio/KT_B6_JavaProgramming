package day14_ForWhileDoWhile;

import java.util.Random;
import java.util.Scanner;

public class C11_SayiBulmaca {
    public static void main(String[] args) {
          /*
        0-20 arasında rastgele bir sayı belirleyelim.
        Daha sonra bu sayıyı 5 hak vererek bulmasını isteyelim.
        Bulunca "Tebrikler buldunuz" yazdıralım
        Bulamazsa "Maalesef bulamadınız" yazdıralım
         */

        Scanner scanner=new Scanner(System.in);

        Random random =new Random();
        int bulunacakSayi = random.nextInt(20);
        int hak=5;
        do {
            System.out.println("Tahmin girin");
            int tahmin = scanner.nextInt();
            if (tahmin==bulunacakSayi){
                System.out.println("Tebrikler");
                break;
            } else {
                System.out.println("Bilemediniz. "+ (--hak)+ " hakkınız kaldı");
            }
        }while (hak!=0);

        System.out.println("bulunacakSayi = " + bulunacakSayi);
    }
}
