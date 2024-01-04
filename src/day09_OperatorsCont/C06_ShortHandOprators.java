package day09_OperatorsCont;

import java.util.Scanner;

public class C06_ShortHandOprators {
    public static void main(String[] args) {
        int number=10;//  dceleration and assignment
        number=20; // asssignment

        System.out.println("number = " + number);

        String text="Java Programming Language";
        System.out.println("text = " + text);
        text="Golden Globe";

        System.out.println("text = " + text);


        int x=50;
        x=x+1;   //x++;
        System.out.println(x);

        x+=25;// x=x+25;
        System.out.println("x = " + x);


        x+=35;

        System.out.println("x = " + x);


        double y=13.5;
        y-=3.5;  // y =y-3.5;
        System.out.println("y = " + y);


        Scanner scanner=new Scanner(System.in);

        double bakiye=1650.54;
        System.out.println("Çekmek istediğiniz tutatrı giriniz : ");
      //  int cekmekistenenTutar=scanner.nextInt();

     //   bakiye-=cekmekistenenTutar;
        System.out.println("bakiyeni  = " + bakiye);


        double sayi=15;
        sayi*=3;
        System.out.println("sayi = " + sayi);

        sayi%=4;
        System.out.println("sayi = " + sayi);

        double maas=5000;
        maas/=2;
        System.out.println("maas = " + maas);


        // String de sadece + (concatenation)

        String word="New";
        System.out.println("word = " + word);
        word+=" Golden";
        System.out.println("word = " + word);
        word+=" Globe ";

        System.out.println("word = " + word);


    }

}
