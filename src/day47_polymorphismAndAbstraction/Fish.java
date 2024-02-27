package day47_polymorphismAndAbstraction;

public class Fish extends Animals{

    String color ="Rengi belli değil";

    String gender ;
    void hareket(){
        System.out.println("yüzerler");
    }
    void solunum (){
        System.out.println("solungaç ile solunum yaparlar");
    }
    void beslenme (){
        System.out.println("hem et hem ot yerler");
    }

    void yuzgec(){
        System.out.println("yüzgeçleri vardır");
    }

    public Integer  number (){
        System.out.println("77");
        return 5;
    }
}
