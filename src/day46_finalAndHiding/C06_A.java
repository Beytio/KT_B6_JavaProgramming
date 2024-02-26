package day46_finalAndHiding;

public class C06_A {

    static {
    System.out.println("A class static blok");
}

    static {
        System.out.println("A class static 2. blok");
    }

    {
        System.out.println("A instance blok");
    }
    public C06_A( String s) {

        System.out.println("A class constructor çalıştı");
        System.out.println(s);
    }


}
