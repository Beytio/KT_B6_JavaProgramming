package day35_Week07_Review;

import java.awt.*;
import java.util.Scanner;

public class C01_StringQuestion {
    public static void main(String[] args) {
        // konsoldan 3 adet strin alın ve uzunluklarına göre kısadan uzuna doğru concat edin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 1. string giriniz : ");
        String kelime1=scanner.nextLine();
        System.out.println("Lütfen 2. string giriniz : ");
        String kelime2=scanner.nextLine();
        System.out.println("Lütfen 3. string giriniz : ");
        String kelime3=scanner.nextLine();


        if (kelime1.length()<kelime2.length() && kelime1.length()<kelime3.length()){
            if (kelime2.length()<kelime3.length()){
                System.out.println(kelime1+kelime2+kelime3);
            }else {
            System.out.println(kelime1+kelime3+kelime2);}
        }


        else if(kelime2.length()<kelime3.length()){
            if (kelime1.length()<kelime3.length()){
                System.out.println(kelime2+kelime1+kelime3);
            }else {
            System.out.println(kelime2+kelime3+kelime1);}
        }



        else {
            if (kelime1.length()<kelime2.length()){
                System.out.println(kelime3+kelime1+kelime2);
            }else{
            System.out.println(kelime3+kelime2+kelime1);}
        }

        }
    }

