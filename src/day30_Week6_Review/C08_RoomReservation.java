package day30_Week6_Review;

import java.util.Scanner;

public class C08_RoomReservation {

    public static void main(String[] args) {

        int odaFiyatı = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Oda rezervasyonu istiyor musunuz: Evet/Hayır");
        String rezervasyonCevabı = sc.nextLine();

        /*
        Evet yada Hayır dışında cevap verirse--> Geçersiz cevap: Yeniden cevaplayınız: Evet/Hayır
         */

        while (!(rezervasyonCevabı.equals("Evet") || rezervasyonCevabı.equals("Hayır"))) {
            System.out.println("Geçersiz cevap: Yeniden cevaplayınız: Evet/Hayır");
            rezervasyonCevabı = sc.nextLine();
        }
        if (rezervasyonCevabı.equals("Hayır")) {
            System.out.println("Güle Güle!!!");
        }
        if (rezervasyonCevabı.equals("Evet")) {
            System.out.println("Hangi tür oda istiyorsunuz");
            String odaTuru = sc.nextLine();
            while (!(odaTuru.equals("Kral") || odaTuru.equals("Aile") || odaTuru.equals("Standart"))) {
                System.out.println("Geçersiz oda türü: Yeniden cevaplayınız: Kral/Aile/Standart");
                odaTuru = sc.nextLine();
            }
            if (odaTuru.equals("Kral")) {
                odaFiyatı += 10000;
            }
            if (odaTuru.equals("Aile")) {
                odaFiyatı += 7500;
            }
            if (odaTuru.equals("Standart")) {
                odaFiyatı += 5000;
            }

            System.out.println(odaTuru + " : " + odaFiyatı + " TL");
        }


    }
}
