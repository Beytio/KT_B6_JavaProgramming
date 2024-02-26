package day46_finalAndHiding;

public class C07_B extends C06_A{

    static {
        System.out.println("B class static blok");
    }
    {
        System.out.println("B instance blok");
    }
    {
        System.out.println("B instance 2.blok");
    }

    public C07_B() {
        super("selam");
        System.out.println("B class constructor çalıştı");
    }

    int a =5;
}
