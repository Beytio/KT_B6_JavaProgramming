package day20_Week4_Review;

public class C01_HelloName {
    /*
        Create a method that Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
         */

    public static void main(String[] args) {

        helloName("Alice");

        System.out.println("---------------");

        String message=helloName1("Bob");
        System.out.println("message = " + message);





    }


    public static void helloName(String name){
        String message="Hello "+ name;
        System.out.println(message);

    }


    public static String helloName1(String name){
        return  "Hello "+ name;
    }


}
