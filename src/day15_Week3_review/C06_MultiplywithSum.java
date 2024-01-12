package day15_Week3_review;

import java.util.Scanner;

public class C06_MultiplywithSum {
    public static void main(String[] args) {

        // 4*3    3+3+3+3   veya   4+4+4


        int result=0;

        Scanner input=new Scanner(System.in);
        System.out.println("First number : ");
        int num1= input.nextInt();//4



        System.out.println("Second number : ");
        int num2=input.nextInt();//3



        if (num1<0 || num2<0){
            System.out.println("INVALID");

        }else {
            for (int i = 0; i <num2 ; i++) {
                result+=num1;
            }
        }


        System.out.println("result = " + result);








        /*

        if (num1>0 && num2>0){
            for (int i = 0; i <num1 ; i++) {
                result+=num2;
            }

        }else {
            System.out.println("INVALID");
        }

      */
    }
}
