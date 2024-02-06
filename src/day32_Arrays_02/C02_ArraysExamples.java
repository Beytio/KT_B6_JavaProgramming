package day32_Arrays_02;

import java.util.Scanner;

public class C02_ArraysExamples {

    //kullanıcıdan 3 adet kelime alın ve bu 3 farklı kelimeyi
    // array içerisine atalım
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. kelime :");
        String kelime1= scanner.nextLine();
        System.out.println("2. kelime :");
        String kelime2= scanner.nextLine();
        System.out.println("3. kelime :");
        String kelime3= scanner.nextLine();

        String [] kelimeler=new String[3];
        kelimeler[0]=kelime1;
        kelimeler[1]=kelime2;
        kelimeler[2]=kelime3;


        for (String klm : kelimeler) {
            System.out.println(klm);
        }

        System.out.println("Girmiş olduğun kelimelerden hangi kelimeyi istiyorsun? 1-2-3");
        int tercih= scanner.nextInt();

      //  System.out.println(kelimeler[tercih]);


        switch (tercih){
            case 1:
                System.out.println(kelimeler[0]);
                break;
            case 2:
                System.out.println(kelimeler[1]);
                break;
            case 3:
                System.out.println(kelimeler[2]);
                break;
            default:
                System.out.println("hatalı giriş");
        }


    }
}
