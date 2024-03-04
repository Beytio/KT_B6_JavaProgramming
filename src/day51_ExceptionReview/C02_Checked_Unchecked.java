package day51_ExceptionReview;

import day47_polymorphismAndAbstraction.Z03_EmirdagLisesi;

import java.io.FileInputStream;

public class C02_Checked_Unchecked {

    public static void main(String[] args) {

        System.out.println("-------------Unchecked Exceptions----------------");

        int i = 15;
        int j = 0;

   //     System.out.println(i/j);  //ArithmeticException: / by zero



        int [] array = {1,8,98,33,20};

     //  System.out.println(array[10]); //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5

        Z03_EmirdagLisesi lise = null;

     //   System.out.println(lise.mudur()); //java.lang.NullPointerException: Cannot invoke "day47_polymorphismAndAbstraction.Z03_EmirdagLisesi.mudur()" because "lise" is null

        String str = null;
    //    System.out.println(str.length()); //java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null


        System.out.println("-------------Unchecked Exceptions----------------");

     //   Thread.sleep(5000);

     //   FileInputStream fis = new FileInputStream("C:/Users/ihsan/sss.txt");

        System.out.println("Hello");
    }
}
