package day51_ExceptionReview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05_DisadvantageOfThrows {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("Test başladı");
        sleep_1(3);
        sleep_2(2.8);


      //  FileInputStream file = new FileInputStream("path");

        System.out.println("Test Bitti");
    }

    public static void sleep_1(double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds*1000));
    }

    public static void sleep_2(double seconds)  {
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
