package day21_ClassAndMethods;

public class Car {

    String marka;
    String model;
    String renk;
    int hiz;

    public void calistir(){
        System.out.println(marka+ " calişiyor.");
    }
    public void hizlan(){
        System.out.println(marka+ " hizlaniyor " + hiz+ " maksimumdur.");
    }
    public void dur(){
        System.out.println(marka+ " duruyor");
    }
}
