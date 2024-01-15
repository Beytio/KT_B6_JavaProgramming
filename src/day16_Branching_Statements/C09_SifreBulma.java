package day16_Branching_Statements;

import java.util.Scanner;

public class C09_SifreBulma {
    public static void main(String[] args) {
        // Şifre tanımlayın ve kullanıcıya ekrandan
        // 5 defa şifreyi girmesini isteyin.
        // Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
        // Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten
        // sonra programdan çıkış işlemi gerçekleşsin.

        String sifre = "kama";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifreyi giriniz.. 5 hakkınız vardır..");

        int hak = 5;

        boolean control = true;

        while (control){
            System.out.println("Tahmin giriniz : ");
            String tahmin = scanner.nextLine();

            if (tahmin.equals(sifre)){
                System.out.println("Tebrikler..!");
                break;
            }
            hak--;
            if (hak == 0){
                System.out.println("Hakkınız bitmiştir. Şifreyi bulamadınız..");
                control=false;
                continue;
            }

            System.out.println("Tekrar deneyiniz. "+hak+ " hakkınız kaldı.");
        }
    }
}
