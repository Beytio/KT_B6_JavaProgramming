package day21_ClassAndMethods;

public class C01_MethodSummary {
    public static void main(String[] args) {

        System.out.println("kup(4) = " + kup(4));
    }

    // girilen sayıya kadar olan sayıların küpünü hesaplayıp toplayan metodu yazın

    public static int kup(int n){
        int kup=0;
        for (int i = 1; i <=n ; i++) {
            kup = kup+i*i*i;
        }
        return kup;
    }
}
