package day36_WrapperClasses;

import java.util.Arrays;

public class C02_WrapperClasses {
    public static void main(String[] args) {
        int x = 5;
        // x.  bize metod vermez

        Integer y = 777;
        //y. bize wrapper classların sağladığı metotları verir

        String  number = y.toString();
        System.out.println("number.length() = " + number.length());

        char ch = 'e';
        //ch. bize metod vermez

        Character ch1 = 'c';
        // ch1. bize wrapper classların sağladığı metotları verir
        System.out.println("ch1.compareTo('a') = " + ch1.compareTo('a'));

        //wrapper classların çeşitli metotları vardır.

        //Class adıyla çağrılan metod ya da fieldlar statiktir...
       // String.join()

        //nesne üzerinden çağrılanlar ise statik değildir.
        //str.toLowerCase()

        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        System.out.println("Character.isLetter('2') = " + Character.isLetter('2'));
        System.out.println("Integer.max(63,87) = " + Integer.max(63, 87));
        System.out.println("Double.sum(25.87,36.1) = " + Double.sum(25.87, 36.1));
        System.out.println("Double.max(92.101,45.55) = " + Double.max(92.101, 45.55));
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);


        Integer sayiW = 10;
        int sayiP = 15;

      //  sayiP = sayiW.intValue();  //unboxing
        System.out.println("sayiP = " + sayiP);

        sayiP = sayiW;   // auto unboxing

        sayiW = sayiP;   // auto boxing

    }
}
