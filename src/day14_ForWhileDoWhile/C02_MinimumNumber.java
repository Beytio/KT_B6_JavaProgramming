package day14_ForWhileDoWhile;

import java.util.Scanner;

public class C02_MinimumNumber {
    public static void main(String[] args) {
        // kullanıcıdan 5 adet rakam alalım
        // girilen rakamlardan en küçüğünü yazdıralım

        Scanner scanner= new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        System.out.println("min = " + min);

        for (int k=1; k<=5;k++){
            System.out.println("Lütfen sayı giriniz");
            int sayi = scanner.nextInt();
            if (sayi<min){
                min =sayi;
            }
        }
        System.out.println("min = " + min);
    }
}
