package day39_ConstructorOverloading;

public class C03_CarObject {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car);// refaransı yazar toString yok bu aşamada
        car.hiz=180;
        System.out.println(car.hiz);// 180
        System.out.println(car.marka);// default


        Car car1=new Car("Honda");

        System.out.println(car1);

        System.out.println("--------------------");

        Car car2=new Car("Honda", "Accord", "Siyah");
        System.out.println(car2);


        System.out.println("--------------------");

        Car.renkSec(car2,"Beyaz");
        System.out.println(car2);


    }
}
