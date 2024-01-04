package day08_ScannerAndOperators;

public class C03_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("90");// 90
        System.out.println("90"+10);// 9010
        System.out.println("90"+10+10);// 901010
        System.out.println("90"+(10+10));// 9020
        System.out.println("90"+(10+10)+30);// 902030
        System.out.println(10+"90"+10);// 109010
        System.out.println(10+10+"90");// 2090
        System.out.println(10+10+"90"+10+20);// 20901020

        System.out.println("----------");

        char ch1='h';

        String str=""+ch1; //


        System.out.println(ch1);
        System.out.println(str);

        System.out.println("----------");

        System.out.println(100/3);
        System.out.println(10/4);
        System.out.println(10/4.0);
        System.out.println(10.0/4);
        System.out.println(10d/4);


        System.out.println("----------");

        System.out.println(10%3);
        System.out.println(10%4);
        System.out.println(10%2);
        System.out.println(10%11);


        // task 72 nin 7 ye bölümünden kalan kaçtır?
        int num2=72;
        System.out.println(num2%7);



    }
}
