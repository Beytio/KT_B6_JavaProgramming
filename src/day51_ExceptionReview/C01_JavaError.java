package day51_ExceptionReview;

public class C01_JavaError {

    public static void main(String[] args) {
         check(10);
         // geriSayim(15);

      //  String str = 5;
        /*
        Java'da errorlar try-catch ile veya başka yolla çözülmez.. sadece kodu düzelterek çözülür..
         */
    }

    public static void check (int i){
        if (i == 0){
            return;
        }else {
           check(i++); //recursion // öz yineleme
        }
    }

    public static void geriSayim(int i){
        if (i >0){
            System.out.println(i);
            i--;
            geriSayim(i);
        } else {
            System.out.println("Bitti");
        }

    }
}
