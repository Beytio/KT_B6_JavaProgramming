package day13_ForLoops;

import java.util.Scanner;

public class C04_If_Switch_Ternary {
    public static void main(String[] args) {
        /* Kullanicidan bir harf isteyin
      o harfle baslayan gun ismi varsa yazdirin
      yoksa "gecersiz harf" yazdirin*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz :");//
        char harf=scanner.next().charAt(0);

        if (harf=='p'|| harf=='P'){
            System.out.println("perşembe, pazartesi, pazar");
        } else if (harf=='s'|| harf=='S') {
            System.out.println("Salı");
        } else if (harf=='c'|| harf=='C') {
            System.out.println("carşamba, cuma, cumartesi");
        }else {
            System.out.println("Geçersiz harf");
        }

        System.out.println("-----------------");



        switch (harf){
            case 'p','P':
                System.out.println("perşembe, pazartesi, pazar");
                break;
            case 's','S':
                System.out.println("Salı");
                break;
            case 'c','C':
                System.out.println("carşamba, cuma, cumartesi");
                break;
            default:
                System.out.println("geçersiz harf");

        }

        System.out.println("-----------------");


        String result=(harf=='p'|| harf=='P') ? "perşembe, pazartesi, pazar" : (harf=='s'|| harf=='S') ? "Salı" :
                (harf=='c'|| harf=='C') ? "carşamba, cuma, cumartesi" : "geçersiz harf" ;

        System.out.println("result = " + result);


    }
}
