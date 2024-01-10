package day12_If_SwitchCase;

import java.util.Scanner;

public class C04_Calculator {
    public static void main(String[] args) {
        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi 1 : ");
        double sayi1= scanner.nextDouble();
        System.out.println("Sayi 2 : ");
        double sayi2= scanner.nextDouble();
        System.out.println("Lütfen yapmak istediğiniz işlemi giriniz :");
        String islem= scanner.next();

        if (islem.equals("+")){
            System.out.println(sayi1+sayi2);
        } else if (islem.equals("-")) {
            System.out.println(sayi1-sayi2);
        } else if (islem.equals("*")) {
            System.out.println(sayi1*sayi2);
        } else if (islem.equals("/")) {
            System.out.println(sayi1/sayi2);
        }else {
            System.out.println("Hatalı işlem girdiniz tekrar deneyiniz...");
        }

        System.out.println("Program bitti");


    }
}
