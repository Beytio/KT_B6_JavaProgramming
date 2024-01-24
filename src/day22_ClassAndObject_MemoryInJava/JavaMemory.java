package day22_ClassAndObject_MemoryInJava;

import day21_ClassAndMethods.Car;

public class JavaMemory {


    String str="Ayşe";
    String str1=new String("Ayşe");



    Circle2 circle2=new Circle2();


    public int variable(int x, int y){

        int b;
        for (int i = 0; i < 5; i++) {
            circle2.perimeter();
            int a=i+5;
            System.out.println("a = " + a);
            b=5;
            System.out.println("b = " + b);
        }
        b=7;
        System.out.println("b = " + b);


        int z=x+y;
        return z;
    }




    public int abc(){

        circle2.area();

        return 0;


    }



}
