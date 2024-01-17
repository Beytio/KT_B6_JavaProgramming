package day17_Methods;

import java.util.Scanner;

public class C07_MethodsExample {

    public static void main(String[] args) {
      /*
        average();
        maxNumber();
        kgToOkkaConverter();


        kgToOkkaConverter2(12);
        System.out.println("---------");
        kgToOkkaConverter2(15);

        karesi(4);

        karesi(56);

        isimYaz("Ali");

        String name="Ayşe";


        isimYaz(name);
         */



        ortalama(4.89,54.9);


    }


    /**
     * a method prints the average of given numbers
     */
    public static void average(){
        double x=3, y=7, z=13;
        double result=(x+y+z)/3;
        System.out.println("result = " + result);
    }


    /**
     * a method that gives the max number
     */
    public static void maxNumber(){
        int x=100, y=20;
        int max;

        if (x>y){
          max=x;
        }else {
            max=y;
        }
        System.out.println("max number  = " + max);
    }


    /**
     * a method convert kilo to okka   1 okka=1,282 kg
     */
    public static void kgToOkkaConverter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kilogram : ");
        double kg= scanner.nextDouble();

        double okka=kg/1.282;
        System.out.println(kg+" kilogram "+ okka+" okkadır");
    }


    /**
     * a method convert kilo to okka   1 okka=1,282 kg
     */
    public static void kgToOkkaConverter2(double kg){
        double okka=kg/1.282;
        System.out.println(kg+" kilogram "+ okka+" okkadır");
    }


    /**
     * a methopd that calculates the square of numbers
     */
    public static void karesi(int num){
        int result=num*num;
        System.out.println(num+"'ün karesi " + result+" dır");
    }


    // parametre olarak isminizi alan ve sonucunda isminiz.... yazan programı yazınız

    public static void isimYaz(String isim){
        System.out.println("isminiz "+isim+" dır");
    }


//iki sayının ortalamasını veren metodu yazınız

    public static void ortalama(double a, double b){
        int result=(int)(a+b)/2;
        System.out.println("result = " + result);
    }
}
