package day51_ExceptionReview;

import javax.swing.plaf.TableHeaderUI;

public class C04_ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test Başladı");
        Thread.sleep(5000);  // throws sadece unchecked exceptionda kullanılır.
        System.out.println("Test devam ediyor");
        Thread.sleep(2000);
        System.out.println("Test devam ediyor");
        Thread.sleep(2000);
        System.out.println("Test Bitti");
    }
}
