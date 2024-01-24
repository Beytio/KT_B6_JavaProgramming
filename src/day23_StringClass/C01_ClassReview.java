package day23_StringClass;

import day20_Week4_Review.C07_Homework;
import day21_ClassAndMethods.Car;

import java.util.Scanner;

public class C01_ClassReview {
    public static void main(String[] args) {

        int i=4;
        boolean bl=true;
        char cr='2';
        double dl=2.4;

        String str="Hello";

        Scanner scanner=new Scanner(System.in);

        Car benimArabam= new Car();
        benimArabam.calistir();
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.hiz = " + benimArabam.hiz);
        benimArabam.marka="Tesla";
        benimArabam.model="Model Y";
        benimArabam.hiz=250;
        benimArabam.renk="Kirmizi";

        benimArabam.calistir();



        Car seninAraban= new Car();
        seninAraban.marka="TOGG";
        seninAraban.model="t10x";
        seninAraban.renk="Toros Sıyahı";
        seninAraban.hiz=210;


        System.out.println("seninAraban.hiz = " + seninAraban.hiz);
        System.out.println("seninAraban.marka = " + seninAraban.marka);
        System.out.println("seninAraban.model = " + seninAraban.model);
        System.out.println("seninAraban.renk = " + seninAraban.renk);

        seninAraban.calistir();
        seninAraban.hizlan();
        seninAraban.dur();

        System.out.println("seninAraban.marka = " + seninAraban.marka);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("--------------------");

        System.out.println("Math.pow(2,2) = " + Math.pow(2, 2));





    }
}
