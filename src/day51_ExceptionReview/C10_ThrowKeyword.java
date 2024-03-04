package day51_ExceptionReview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C10_ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Sigara almak istiyorsunuz \n Lütfen yaşınızı giriniz");

        int girilenYas = new Scanner(System.in).nextInt();

        if (girilenYas<0){
            throw new InputMismatchException("Yaşınız eksi olamaz");
        }
        if(girilenYas >18 ) {
            System.out.println("Sigara alabilirsiniz");
        }else {
            throw new RuntimeException("Yaşınız uygun değildir");
        }
    }



}
