package day51_ExceptionReview;

public class C07_MultiCatch_2 {

    public static void main(String[] args) {



        String str = "12525251";

        System.out.println("test başladı");

        try {
            System.out.println(str.length());
            System.out.println(str.substring(0, 6));
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("birinci catch");
            System.out.println(e.getMessage());
        }

        System.out.println("test bitti");

    }
}
