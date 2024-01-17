package day18_CustomMethods;

public class C02_CustomMethodsPractice {

    public static void main(String[] args) {
        System.out.println("Program has started...");

        helloWorld5Times();
        System.out.println("------------------");
        countDownTenToZero();
        System.out.println("-------------");
        evenNumbers();
        System.out.println("--------------------");

        oddNumbers();

        System.out.println("Program has finished...");

    }

    //     a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }


//     a function that print Ten to Zero  ==> countdownTenToZero()

    public static void countDownTenToZero(){
        int i=10;
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }
    }


    //     a function that can print all the even numbers from [1 ~ 100] ==> evenNumbers

    public static void evenNumbers(){
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }



    public static void oddNumbers(){
        for (int i = 1; i <= 100; i++) {
            if(i%2!=0){
                int result=i*2;
            }
        }

    }



}






//     a function that can print hello world 5 times ==> helloWorld5Times()
//     a function that print Ten to Zero  ==> countdownTenToZero()
//     a function that can print all the even numbers from [1 ~ 100] ==> evenNumbers