package day17_Methods;

public class C06_MethosCont {
    public static void main(String[] args) {
       message_1();

    }

    public static void message_1(){
        message_2();
        System.out.println("1");
    }

    public static void message_2(){
        message_3();
        System.out.println("2");
    }

    public static void message_3(){
        System.out.println("3");
    }

}
