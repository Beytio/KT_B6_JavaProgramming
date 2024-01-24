package day21_ClassAndMethods;

public class Car {

    public String marka;
    public String model;
    public String renk;
    public int hiz;

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
