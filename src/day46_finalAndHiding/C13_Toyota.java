package day46_finalAndHiding;

public class C13_Toyota extends C12_Araba{

    int a = 10;
    void print(){
        System.out.println(a);
    }

    public static Integer  marka(){
        System.out.println("Toyota");
        return 5;
    }

    public static void main(String[] args) {
        C13_Toyota toyota = new C13_Toyota();
        System.out.println("toyota.a = " + toyota.a);
        toyota.print();

        toyota.marka();
    }
}
