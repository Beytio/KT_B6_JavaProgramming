package day11_ControlFlowStatement_IF;

import java.util.Scanner;

public class C05_If_Else_ClasTask_2 {
    public static void main(String[] args) {
          /*
        hava sıcaklığı isminde bir değişken declare edin ve değer atayın
        sıcaklık 20 derece ve üzerinde ise hava sıcak yazsın
        sıcaklık 20 derece ve altında ise hava soğuk yazsın
         */

        double havaSicakligi = 19.8;

        if (havaSicakligi >= 20) {
            System.out.println("hava sıcak");
        } else {
            System.out.println("hava soğuk");
        }


        System.out.println("-------------------------");

       /*
       kullanıcıdan bir sayı alın ve negatif ya da pozitif olduğunu ekrana yazdırın..
        */

        Scanner sayi = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam = sayi.nextInt();
        // eğer if veya else den sonra tek satır kod varsa istenilirse süslü parantez
        // {} kullanılmayabilir.

        if (rakam>0)
            System.out.println("Girilen rakam : "+rakam+" pozitiftir.");
        else
            System.out.println("Girilen rakam : "+rakam+" negatiftir.");
    }
}
