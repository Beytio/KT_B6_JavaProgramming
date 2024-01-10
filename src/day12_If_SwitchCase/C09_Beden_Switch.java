package day12_If_SwitchCase;

import java.util.Scanner;

public class C09_Beden_Switch {
    public static void main(String[] args) {
        //        //Bir program yazın switch yapısını kullanın.
//// Şu beden numaralarını : small(38-40-42),
//// medium(44-46-48), large(50-52-54) yakalasın. Aşağıdaki şekilde çıktı alın.
//        //Example output: 50 numara bir large bedendir.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bedeniniz giriniz :");
        int beden =scanner.nextInt();

        switch (beden){
            case 38,40,42:
                System.out.println(beden+" numara bir small bedendir");
                break;
            case 44,46,48:
                System.out.println(beden+" numara bir medium bedendir");
                break;
            case 50,52,54:
                System.out.println(beden+" numara bir large bedendir");
                break;
            default:
                System.out.println("Bedeniniz mağazamızda bulunmamaktadır");
        }



//
    }
}
