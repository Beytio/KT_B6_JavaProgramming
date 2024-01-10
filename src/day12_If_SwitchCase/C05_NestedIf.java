package day12_If_SwitchCase;

import java.util.Scanner;

public class C05_NestedIf {
    public static void main(String[] args) {
        // Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını
        //sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzerinde ise yanında bayan olup olmadığını sorun
        // bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğiniz sorun
        //yüzme bilmiyor ise yine giriş yapamasın

        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınız giriniz :");
        int age= scan.nextInt();

        if(age>=18){
            System.out.println("Yanınızda bayan var mı?Evet / Hayır :");
            String cevap= scan.next();
            if (cevap.equals("Evet")){
                System.out.println("Yüzme biliyor musunuz? Evet /Hayır");
                String cevap2= scan.next();
                if (cevap2.equals("Evet")){
                    System.out.println("hoş geldiniz");
                }else{
                    System.out.println("Yüzme bilmiyorsunuz giremezsiniz");
                }

            }else {
                System.out.println("Yanınızda bayan yok giremezsiniz");
            }



        }else {
            System.out.println("Yaşınız küçük havuza giremezsiniz");
        }

    }
}
