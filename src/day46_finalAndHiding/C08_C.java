package day46_finalAndHiding;

public class C08_C extends C07_B{

    static {
        System.out.println("C class static blok");
    }

    {
        System.out.println("C instance blok");
    }

    public C08_C() {
        super();
        System.out.println("C class constructor çalıştı");
    }
    int a = 20;

    public void print(){
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
