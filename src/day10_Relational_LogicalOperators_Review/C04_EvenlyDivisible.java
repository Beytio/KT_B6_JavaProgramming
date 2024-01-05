package day10_Relational_LogicalOperators_Review;

import java.util.Scanner;

public class C04_EvenlyDivisible {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int number=scan.nextInt();

        boolean isDivisibleBy2=number%2==0;
        boolean isDivisibleBy3=number%3==0;
        boolean isDivisibleBy5=number%5==0;
        boolean isDivisibleBy9=number%9==0;
        boolean isDivisibleBy11=number%11==0;

        System.out.println(number+ " isDivisible By 2 = " + isDivisibleBy2);
        System.out.println(number+ " isDivisible By 3 = " + isDivisibleBy3);
        System.out.println(number+ " isDivisible By 5 = " + isDivisibleBy5);
        System.out.println(number+ " isDivisible By 9 = " + isDivisibleBy9);
        System.out.println(number+ " isDivisible By 11 = " + isDivisibleBy11);


    }
}
/*
*  write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5

    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
				65 is divisible by 6: true
				65 is divisible by 9: true
 */