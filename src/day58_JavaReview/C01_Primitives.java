package day58_JavaReview;

import day39_ConstructorOverloading.Student;

import java.util.ArrayList;

public class C01_Primitives {
    public static void main(String[] args) {
        byte b = 12;
        short s = 1000;
        int i = 2502;
        long l = 2522553333222L;
        float f = 25.58F;
        double db = 25.8;

        char c = '2';
        char c1 = 'A';
        char c2 = 258;
        System.out.println(c2);
        boolean bl = true;

        s = b;
        db = l;  // auto casting / widening casting java otomatik yapar

        i = (int) f;  // narrowing casting -- java otomatik olarak yapmaz.

        var str = "Ali";

        var d = new ArrayList<>();
        d.add(5);

        var stu = new Student();
    }
}
