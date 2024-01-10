package day13_ForLoops;

public class C02_TernaryExamples {
    public static void main(String[] args) {

        //bir a değişkenim olsun değeri 0'dan büyükse değerini ikiye katlayalım
        // değeri sıfır ve sıfırdan küçükse değerini 10 arttıralım
        int a = -17;

        if (a > 0) {
            a *= 2;
        } else {
            a += 10;
        }

        System.out.println("a = " + a);
        System.out.println("------------------");

        //bir b değişkenim olsun değeri 0'dan büyükse değerini ikiye katlayalım
        // değeri sıfır ve sıfırdan küçükse değerini 10 arttıralım (ternary)

        int b = -10;

        b = b > 0 ? b * 2 : b + 10;

        System.out.println("b = " + b);

        System.out.println("------------------");

        //nested ternary
        int x = 10;
        int y = 50;

        System.out.println(x<y
                ? x>5 ? x+2 : x-2
                : y>10 ? y+2: y-2);

    }
}
