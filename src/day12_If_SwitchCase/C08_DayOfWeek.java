package day12_If_SwitchCase;

import java.util.Scanner;

public class C08_DayOfWeek {

    public static void main(String[] args) {
        // haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın
        // 1 Pazartesi
        // 3 çarşamba
        // 7 Pazar

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int gun= scanner.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş");
        }

    }
}
