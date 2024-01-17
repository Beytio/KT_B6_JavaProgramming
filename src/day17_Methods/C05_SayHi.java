package day17_Methods;

public class C05_SayHi {

    public static void main(String[] args) {
        System.out.println("Program başladı");

        int money=4_000_000;

        if (money>5_000_000){
           sayHi();
        }else {
            sayBye();
        }
        System.out.println("Program bitti");
    }



    public static void sayHi(){
        System.out.println("Merhaba");
    }


    public static void sayBye(){
        System.out.println("Güle güle");
    }


}
