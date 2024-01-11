package day14_ForWhileDoWhile;

import java.util.Scanner;

public class C08_ParolayiTahminEt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = "ipek";
        int hak = 3;

        System.out.println("Lütfen parolayı tahmin ediniz.. 3 hakkınız vardır.");

        while (0 < hak){
            String tahmin = scanner.nextLine();
            if (tahmin.equals(parola)){
                System.out.println("Tebrikler. Parolayı bildiniz");
                break;
            } else {
                System.out.println("Parola yanlış. Kalan hakkınız: "+(--hak));
            }
        }
    }
}
