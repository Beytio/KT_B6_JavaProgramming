package day19_ReturnMethodsAndMethodOverloading;

import java.util.Scanner;

public class C01_MethodTasks {
    public static void main(String[] args) {

        printJava();
        printJava();
        printJava();
        printSelenium();
        buyukOlaniYazdir();
        buyukOlaniYazdirParametreli( 58,36);
        buyukOlaniYazdirParametreli( (int) 58.8,36);



    }
    //  çağrıldığında Java Candır. yazdıran metodu hazırlayalım..
   public static void printJava(){
       System.out.println("Java Candır");
       printSelenium();
   }

   public static void printSelenium(){
       System.out.println("Selenium da Candır");
      // printJava();
   }

   //iki sayıdan büyük olanı yazdıran metodu yazınız

    public static void buyukOlaniYazdir(){
        int i = 25;
        int j = 40;

        if (i>=j) {
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }
    }

    public static void buyukOlaniYazdirParametreli(int i , int j){

        if (i>=j) {
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }
    }


}
