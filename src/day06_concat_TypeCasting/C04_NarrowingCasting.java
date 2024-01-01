package day06_concat_TypeCasting;

public class C04_NarrowingCasting {
    public static void main(String[] args) {

        short s = 5;

        byte b = (byte) s;

        System.out.println("b = " + b);

        s = 128;

        byte b1 = (byte) s;  // veri kaybı olur

        System.out.println("b1 = " + b1);


        // byte b2= 128; olmaz

        int i = 25545;

        short sh = (short) i;

        System.out.println("sh = " + sh);

        double db = 2.0;

        int a = (int) db;

        System.out.println("a = " + a);

        db = 2.4;

        int c = (int) db;

        System.out.println("c = " + c);

        byte z = 3;
        byte y = 4;

        int sonuc = z + y;

        byte result = (byte) (z + y);
        System.out.println("result = " + result);

        System.out.println("sonuc = " + sonuc);

        int k = 10;
        int l = 3;

        double r = k / l;

        System.out.println("r = " + r);

        double n=(double) k/l;

        System.out.println("n = " + n);

        double o = 10;
        double p = 3;

        double q = o / p;

        System.out.println("q = " + q);


    }
}
