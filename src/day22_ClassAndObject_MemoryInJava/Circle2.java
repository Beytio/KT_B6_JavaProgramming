package day22_ClassAndObject_MemoryInJava;

public class Circle2 {
    double radius;
    static double pi;


    public double area() {
        double area=pi*radius*radius;

        return Math.PI * Math.pow(radius, 2);
        // return PI * radius*radius;
    }

    public double perimeter() {

        area2();
        return 2 * Math.PI * radius;
    }


    public static double area2() {

        perimeter2();

        double area=pi;
        //perimeter();
        return Math.PI * Math.pow(3, 2);
       //  return PI * radius*radius;
    }

    public static double perimeter2() {
        return 2 * Math.PI;
    }


}
