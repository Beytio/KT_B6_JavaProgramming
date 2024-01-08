package day11_ControlFlowStatement_IF;

import java.util.Scanner;

public class C03_If_Else {
    public static void main(String[] args) {
        char medeniDurum = 'B';
        boolean isMarried = medeniDurum == 'E';

        if (isMarried) {
            System.out.println("Evlilik yardımı alabilirsiniz");
        } else {
            System.out.println("Evlilik yardımı alamazsınız");
        }

        System.out.println("-----------------------------");

          /*
    alinin fizik notu 50
    kimya notu 30
    ortalaması 50 üzerinde ise ekrana geçti yazsın
    50 altında ise kaldı yazsın

           */

        double fizikNot = 50;
        double kimyaNot = 60;
        double ort = (fizikNot + kimyaNot) / 2;

        if (ort > 50) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        // yukarıdaki soruyu scanner class kullanarak yapalım

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Türkçe notunuzu giriniz :");

        double turkceNot = scan.nextDouble();

        System.out.println("Lütfen Matematik notunuzu giriniz : ");
        double matNot = scan.nextDouble();

        double ortalama = (turkceNot+matNot)/2;

        if (ortalama>=50){
            System.out.println("Geçti");
        }else{
            System.out.println("Kaldınız");
            System.out.println("Lütfen bütünleme sınav kaydı yapınız.");
        }


    }
}
