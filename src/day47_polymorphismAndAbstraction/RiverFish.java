package day47_polymorphismAndAbstraction;

public class RiverFish extends Fish{
    String name ="RiverFish";
    String color = "Rengi girilmemiş";

    String gender ="Belirtilmemiş";
    String tip;

    void water (){
        System.out.println("Tatlı suda yaşarlar");
    }
    void beslenme (){
        System.out.println("ot yerler");
    }
}
