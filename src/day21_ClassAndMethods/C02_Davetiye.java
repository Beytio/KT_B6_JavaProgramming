package day21_ClassAndMethods;

import java.util.Scanner;

public class C02_Davetiye {
    public static void main(String[] args) {
        davetiye();
    }

    public static void davetiye (){
        while (true) {
            Scanner words = new Scanner(System.in);
            System.out.println("İki kelime giriniz : ");
            String kelime1 = words.nextLine();
            String kelime2 = words.nextLine();

            if (kelimeKontrol(kelime1, kelime2)) {
                System.out.println("Kelimeler aynı, lütfen tekrar giriniz");
                continue;

            } else {
               susle(kelime1,kelime2);
               break;
            }
        }

    }

    public static void susle(String str, String str1) {
        System.out.println( "********* "+str+" ************ "+str1+" *************");
    }

    public static boolean kelimeKontrol(String str, String str2){
        return str.equals(str2);
    }
}

        /*

        //Kullanıcıdan
        //2 adet kelim e isteyen bir metodunuz olsun Bu metot
        //kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
        //kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
        //kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
        //istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
        //bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin
         */