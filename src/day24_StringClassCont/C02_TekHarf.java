package day24_StringClassCont;

import java.util.Scanner;

public class C02_TekHarf {
    public static void main(String[] args) {
     System.out.println(tekHarf());

    }

    public static boolean tekHarf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birşeyler giriniz");
        String girilen = scanner.nextLine();

        int uzunluk = girilen.length();

        return uzunluk == 1;  // uzunluk==1 doğru ise true değilse false değerini alır..
    }

}