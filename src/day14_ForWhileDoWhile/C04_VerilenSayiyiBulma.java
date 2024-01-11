package day14_ForWhileDoWhile;

import java.util.Random;
import java.util.Scanner;

public class C04_VerilenSayiyiBulma {
    public static void main(String[] args) {
         /*
        0-20 arasında rastgele bir sayı belirleyelim.
        Daha sonra bu sayıyı 5 hak vererek bulmasını isteyelim.
        Bulunca "Tebrikler buldunuz" yazdıralım
        Bulamazsa "Maalesef bulamadınız" yazdıralım
         */

        Random random=new Random();
        int bulunacakSayi = random.nextInt(21) ;
        int hak = 5;

        for (int i=1; i <=5; i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Tahminini gir bakalım");
            int tahmin= scanner.nextInt();

            if (tahmin==bulunacakSayi){
                System.out.println("Tebrikler buldunuz");
                break;
            }else {
                System.out.println("Maalesef bulamadınız "+ (--hak)+" hakkın kaldı.");
            }
        }

        System.out.println("bulunacakSayi = " + bulunacakSayi);

    }
}
