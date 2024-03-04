package day51_ExceptionReview;

import java.util.Scanner;

public class C06_MultiCatch {

    public static void main(String[] args) {



        String str = "1235355";

        System.out.println("test başladı");

        try {
            System.out.println(str.length());
            System.out.println(str.substring(0, 6));
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NullPointerException e) {
            System.out.println("birinci catch");
            System.out.println(e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("ikinci catch");
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("üçüncü catch");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("dördüncü catch");
            System.out.println(e.getMessage());
        }

        System.out.println("test bitti");

    }
}
