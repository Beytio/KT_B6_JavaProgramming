package day19_ReturnMethodsAndMethodOverloading;

public class C06_MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(5.8, 4.2));
        System.out.println(sum(2, 3, 9));
        System.out.println(sum(2, 3));

        System.out.println(Math.PI);

    }

    //iki sayıyı toplayıp sonucu dönen metodu yazınız

    // METHOD OVERLOADING
    // SAME METHOD NAME; DIFFERENT PARAMETER
    // değişik parametre nasıl olur
    // 1- data tipini değişir (int , double , String)
    // 2 - parametre sayısı değişir
    // 3- parametre sırası değişir.

    public static int sum(int a, int b){
        int toplam = a+b;
        return toplam;
    }

    public static double sum(double a, double b){
        double toplam = a+b;
        return toplam;
    }

    public static int sum(int a, int b, int c){
        int toplam = a+b+c;
        return toplam;
    }

    public static double sum(int a, double b, int c){
        double toplam = a+b+c;
        return toplam;
    }


    public static double sum(int a, int b, double c){
        double toplam = a+b+c;
        return toplam;
    }

}
