package day58_JavaReview;

public class C05_LoopReview {
    public static void main(String[] args) {


      //  outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j % 2 == 0) {
                    System.out.println("Java");
                    break;
                    //return metodlarda kullanılır ve metodu bitirir.

                }
                System.out.println("Hava");
            }
        }

        System.out.println("yazdir(6) = " + yazdir(6));
    }

    public static String yazdir(int i){
        for (int j = 0; j < i; j++) {
            if (j == 5){
                return "sayı beş oldu";
            }
        }
        return "sayı beş olmadı";
    }
}
