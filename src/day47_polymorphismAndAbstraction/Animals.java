package day47_polymorphismAndAbstraction;

public class Animals {
     String name ="Animal";
     String color;

     String gender ="Belirtilmemiş";

    void hareket(){
        System.out.println("hareket ederler");
    }
    void solunum(){
        System.out.println("nefes alırlar");
    }

    void beslenme (){
        System.out.println("beslenirler");
    }

     Number  number (){
        System.out.println("7");
        return 3;
    }
}
