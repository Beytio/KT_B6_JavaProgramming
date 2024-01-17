package day17_Methods;

public class C04_Methods {

    public static void main(String[] args) {

        sayHi();
        System.out.println("Program başladı");

        sayHi();

        System.out.println("Program bitti");
        sayBye();

    }


    public static void sayHi(){
        System.out.println("Merhaba");
    }


    public static void sayBye(){
        System.out.println("Güle güle");
    }


}
