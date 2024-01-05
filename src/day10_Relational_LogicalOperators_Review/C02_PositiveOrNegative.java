package day10_Relational_LogicalOperators_Review;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class C02_PositiveOrNegative {
    public static void main(String[] args) {

        int a=10;  // assignment operator

        System.out.println(a==10);
        System.out.println(a==20);
        System.out.println(a!=20);

        Scanner scan=new Scanner(System.in);
        System.out.println("Lüutfen bir sayi giriniz  : ");
        int number=scan.nextInt();

        boolean isPositive= number>0;

        boolean isNegative=number<0;

        boolean isZero= number==0;

        System.out.println("isNegative = " + isNegative);
        System.out.println("isPositive = " + isPositive);
        System.out.println("isZero = " + isZero);


    }
}

// Kullanicidan bir integer deger alin
// Sayinin negatif pozitif sifir oldugunu ekrana yazdirsin