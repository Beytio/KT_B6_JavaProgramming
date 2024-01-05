package day10_Relational_LogicalOperators_Review;

import java.util.Scanner;

public class C05_SwapVariables {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        int temp;
        temp=a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=b;
        b=temp;


        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("-------------------");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1= scan.nextInt();

        System.out.println("Enter your second number");
        int num2= scan.nextInt();

        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);


        //temprerary
        int temp1=num1;
        num1=num2;
        num2=temp1;


        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);


    }
}
/*
write a program that can swipe two variables that the user enters by using a temporary variable
get numbers from user;

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */
