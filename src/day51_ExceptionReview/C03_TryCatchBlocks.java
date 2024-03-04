package day51_ExceptionReview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("----------Unchecked Exceptions---------");
        System.out.println("Test 1 başladı");

       try {
           System.out.println(9 / 0);
       }catch (ArithmeticException e){
           System.out.println("catch blok çalıştı");
           System.out.println("------");
           System.out.println(e.getMessage());
           System.out.println("------");
         //  e.printStackTrace();
       }
        System.out.println("1. Test Bitti");


        System.out.println("Test 2 başladı");

        int nums []  = {87,20,3,669,10};

        try {
            System.out.println(nums[15]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(nums[nums.length-1]);
            System.out.println("Catch çalıştı");
            System.out.println(e.getMessage());
         //   e.printStackTrace();
        }

        System.out.println("2. Test Bitti");

        System.out.println("Test 3 başladı");

        try {
            System.out.println("Java".substring(2,0));
        }catch (StringIndexOutOfBoundsException s){
            System.out.println("Catch blok çalıştı");
            System.out.println(s.getMessage());
        //    s.printStackTrace();
            System.out.println("Java".substring(0,2));
        }

        System.out.println("3. Test Bitti");

        System.out.println("----------Checked Exceptions---------");

        System.out.println("Test 4 başladı");

        try {
            Thread.sleep(-5000);
        } catch (Exception e) {
            System.out.println("Catch Blok çalıştı");
            System.out.println(e.getMessage());
        }

        System.out.println("4. Test Bitti");


        System.out.println("Test 5 başladı");

        try {
            FileInputStream file = new FileInputStream("C:\\Users\\ihsan\\OneDrive\\Masaüstü\\sss.txt");
        }catch (FileNotFoundException e){
            System.out.println("Catch çalıştı");
            System.out.println(e.getMessage());
        }

        System.out.println("5. Test Bitti");

    }


}
