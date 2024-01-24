package day22_ClassAndObject_MemoryInJava;

public class Math2 {

    public static int pow(int x, int y){
        int result=1;
        for (int i = 0; i < y; i++) {
            result*=x;
        }
        return result;
    }


    public int pow2(int x, int y){
        int result=1;
        for (int i = 0; i < y; i++) {
            result*=x;
        }
        return result;
    }
}
