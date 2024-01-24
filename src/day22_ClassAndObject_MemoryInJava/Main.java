package day22_ClassAndObject_MemoryInJava;

import day21_ClassAndMethods.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle2 circle2=new Circle2();
        circle2.radius=5;
        System.out.println("circle2.area() = " + circle2.area());

        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

        System.out.println("Circle2.area2() = " + Circle2.area2());

        System.out.println("Math2.pow(2,3) = " + Math2.pow(2, 3));

        Math2 math2=new Math2();
        System.out.println("math2.pow2(3,4) = " + math2.pow2(3, 4));

        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }
}
