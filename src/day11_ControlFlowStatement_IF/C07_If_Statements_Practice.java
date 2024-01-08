package day11_ControlFlowStatement_IF;

import java.util.Scanner;

public class C07_If_Statements_Practice {
    public static void main(String[] args) {
         /*
        ayşenin cep harçlığı 5 liradan az ise babası ona 10 tl daha versin
        50 liradan fazla ise babası 20 tl sini alsın
        aksi durumda babası para vermesin ama almasın da

          */

        double aysePara = 3;

        if (aysePara < 5) {
            aysePara += 10;  // aysePara= aysePara+10;
            System.out.println("aysePara = " + aysePara);
        } else if (aysePara > 50) {
            aysePara -= 20;
            System.out.println("aysePara = " + aysePara);
        } else {
            System.out.println("aysePara = " + aysePara);
        }

        // 3 adet açı girilmesi isteyelim
        // bu açıların bir üçgene ait olup olmadığını kontrol edelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci açıyı giriniz");
        int first = scanner.nextInt();

        System.out.println("İkinci açıyı giriniz");
        int second = scanner.nextInt();

        System.out.println("Üçüncü açıyı giriniz");
        int third = scanner.nextInt();

        int aciToplam = first + second + third;

        if (aciToplam == 180) {
            System.out.println("Bu bir üçgendir");
        } else {
            System.out.println("Bu bir üçgen değildir");
        }

        System.out.println("-----------------------------");
          /*
        bir program yazın eğer x in değeri 10 ise y ye 20 atansın
        x in değeri 20 ise y ye 30 atansın
        x in değeri 30 ise y ye 40 atansın
        değil ise y ye 0 atansın
        */

        int x = 25, y;

        if (x == 10) {
            y = 20;
        } else if (x == 20) {
            y = 30;
        } else if (x == 30) {
            y = 40;
        }else {
            y = 0;
        }

        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
