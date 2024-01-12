package day15_Week3_review;

import java.util.Scanner;

public class C05_SumOfAnyNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int num1=scanner.nextInt();
        System.out.println("2. sayı giriniz ");
        int num2=scanner.nextInt();

        int toplam=0;
        for (int i = num2; i < num1 ; i++) {

            if (i%2!=0){
                toplam+=i;
            }

        }
        System.out.println("toplam = " + toplam);
    }
}


//    Merhabababmerhabamermer