package day21_ClassAndMethods;

public class Circle {

    double radius;
    final double PI = Math.PI;

    public double area() {
        return PI * Math.pow(radius, 2);
       // return PI * radius*radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }
}
