package day44_AbstractClassAndInterface.car;

public class Audi extends Car{

    public Audi( String model, String color, int year, double price){
        super("Audi",model,color,year,price);
    }
    public void start(){
        System.out.println("Push the start button");
    }

    public void quatro(){
        System.out.println("Quatro feature is active");
    }

    public void autoPark(){
        System.out.println("Audi is autoparking");
    }


}
