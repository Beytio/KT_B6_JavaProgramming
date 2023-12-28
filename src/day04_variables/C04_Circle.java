package day04_variables;

public class C04_Circle {
    public static void main(String[] args) {
/*
    Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
        PI, radius, diameter, area, perimeter

        Hints: 	PI = 3.14
        area = radius * radius * PI  // radius= cap  area = alan perimeter = cevre
        Perimeter = diameter * PI
 */
        double r=5;
        double PI=3.14;

        double area=PI*r*r;
        double perimeter=2*PI*r;

        System.out.println("Yarıçap : "+r);
        System.out.println("PI : "+PI);

        System.out.println("Area : "+area);
        System.out.println("Perimeter : "+perimeter);
    }

}
