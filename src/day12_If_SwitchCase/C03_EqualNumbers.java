package day12_If_SwitchCase;

public class C03_EqualNumbers {
    public static void main(String[] args) {
        //3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        //(min 2 sayı eşit olmalı)
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız
        // 11 ,22,33   eşit sayı yok
        // 11,22,22    22
        // 22,22,22    22
        //22,33,22     22

        int x, y,z ;// decleration
        x=3;
        y=33;
        z=333;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        if(x==y){
            System.out.println(x);
        } else if (y==z) {
            System.out.println(y);
        } else if (x==z) {
            System.out.println(x);
        }else {
            System.out.println("Eşit sayı yoktur");
            System.out.println("Sayıları değiştiriniz");

        }

        System.out.println("Program bitti");



        if(false) System.out.println(x);
        else
            System.out.println(y);
            System.out.println(z);



    }
}
