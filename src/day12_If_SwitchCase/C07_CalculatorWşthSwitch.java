package day12_If_SwitchCase;

import java.util.Scanner;

public class C07_CalculatorWşthSwitch {
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


        switch (islem){
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatalı işlem girdiniz");

        }

        System.out.println("Program bitti");

    }
}
