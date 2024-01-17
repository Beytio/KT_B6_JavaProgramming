package day18_CustomMethods;

public class C01_CustomMethod {

    public static void main(String[] args) {



        System.out.println("Program has started...");
        greetings();
        greetings();
        warmGreetings();

        System.out.println("Program has finished...");

        greetingsWithReturnTYpe();

        C02_CustomMethodsPractice.helloWorld5Times();

    }

    public static void greetings(){
        System.out.println("Hello World");
    }


    public static void warmGreetings(){
        greetings();
        System.out.println("What's up guys!!");
    }



    public static String greetingsWithReturnTYpe(){
        String str="The secret of life is ! : ";

        System.out.println(str);

        return str;
    }







}
