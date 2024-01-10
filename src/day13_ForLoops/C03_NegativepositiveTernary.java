package day13_ForLoops;

import java.util.Scanner;

public class C03_NegativepositiveTernary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :");
        int n= scanner.nextInt();

        if (n>0){
            System.out.println("Sayı pozitiftir.");
        } else if (n<0) {
            System.out.println("Sayi negatiftir");
        }else {
            System.out.println("Sayı sıfırdır");
        }

        System.out.println("------------------------");

        String result=n>0 ? "Sayı pozitiftir." : (n<0 ? "Sayi negatiftir" : "Sayı sıfırdır.");


        System.out.println("result = " + result);

    }
}
