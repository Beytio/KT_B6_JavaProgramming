package day21_ClassAndMethods;

public class C03_Fibonacci {
    public static void main(String[] args) {
        fibonacci(5,5000,50);
    }

    // fibonacci dizisini veren kodu yazınız
    // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21, 34, .....
    // 3,4 , 7 , 11 , 18 , 27, ....

    public static void fibonacci(double ilk, double ikinci, int adet){

        for (int i = 1; i <=adet ; i++) {
            System.out.print(ilk+" ");
            System.out.print(ikinci+" ");
            ilk+=ikinci;
            ikinci+=ilk;

            double altinOran =ikinci/ilk;

            System.out.print(altinOran+" ");
        }
    }
}
