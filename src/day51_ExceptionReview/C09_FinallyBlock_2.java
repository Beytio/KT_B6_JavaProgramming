package day51_ExceptionReview;

public class C09_FinallyBlock_2 {
    public static void main(String[] args) {

        System.out.println("Test Başladı");

        String[] names = {"Ali", "Hamza", "Suat"};

        try {
            System.out.println(names[10]);
        }  finally {
            System.out.println("Finally Test Bitti");
        }
        System.out.println("hello");

    }
}
