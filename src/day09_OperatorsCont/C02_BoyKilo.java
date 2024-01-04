package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BoyKilo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz :(Ornek : 1,82)");
        double boy=scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :(Ornek : 82,5)");
        double kilo=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Lütfen isminizi giriniz : ");
        String name=scanner.nextLine();

        System.out.println(name+"; boyunuz : "+boy+" m, kilonuz : "+kilo+" kg");


    }
}
