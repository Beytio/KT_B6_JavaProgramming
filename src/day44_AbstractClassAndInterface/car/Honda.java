package day44_AbstractClassAndInterface.car;

public class Honda extends Car{

    public Honda( String model, String color, int year, double price) {

        super("Honda",model,color,year,price);
    }

    public void start(){
        System.out.println("twist the key to start");
    }

    public void stop(){
        System.out.println("VTEC engine needs a perfect breaking system. Hold on");
    }

}
