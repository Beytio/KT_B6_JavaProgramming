package day11_ControlFlowStatement_IF;

import java.util.Scanner;

public class C04_If_Else_ClassTask {

    public static void main(String[] args) {
     /*
        fizik, kimya, matematik ve geçme notlarını konsoldan alın
        ortalamayı hessaplayın
        geçti ise "Tebrikler geçtiniz"
        kaldi ise "Ders tekrarı gerekmektedir."
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ders notlarını giriniz :");
        System.out.print("Fizik  : ");
        double fizikNot = input.nextDouble();

        System.out.print("Kimya  : ");
        double kimyaNot = input.nextDouble();

        System.out.print("Matematik  : ");
        double matematikNot = input.nextDouble();

        System.out.print("Bu dönem için çan eğrisi geçme notunu giriniz :");
        double gecmeNotu = input.nextDouble();

        double ortalama = (fizikNot + kimyaNot + matematikNot) / 3;

        if (ortalama>=gecmeNotu){
            System.out.println("Ortalamanız :"+ortalama);
            System.out.println("Tebrikler geçtiniz");
        } else {
            System.out.println("Ortalamanız :"+ortalama);
            System.out.println("Ders tekrarı gerekmektedir.");
        }

        System.out.println("Program bitti...");
    }
}
