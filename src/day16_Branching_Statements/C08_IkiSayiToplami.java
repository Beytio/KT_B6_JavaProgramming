package day16_Branching_Statements;

import java.util.Scanner;

public class C08_IkiSayiToplami {
    public static void main(String[] args) {
        // Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2
        // sayının toplamı 25 ve 25 üzerindeyse ise programdan çıkış işlemi gerçekleştirin.
        // 25 değil ise program kullanıcıdan iki sayı almaya devam etsin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("program başladı");

        int result=0;

        while (true){
            System.out.println(" x sayısını giriniz : ");
            int x = scanner.nextInt();
            System.out.println(" y sayısını giriniz : ");
            int y = scanner.nextInt();

             result+=(x+y);

            if (result>=25){
                break;
            }

        }

        System.out.println("result = " + result);

    }
}
