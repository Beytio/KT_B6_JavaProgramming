package day30_Week6_Review;

import java.util.Random;

public class C05_RandomPassword {

    public static void main(String[] args) {

        //rastgele 8 harfli bir şifre

        String str= "ABCDEFGHIJKLMNOPQRSTUVWYZabcdefgijklmnoprstuvwxyz0123456789_!@#$%&*ABCDEFGHIJKLMNOPQRSTUVWYZabcdefgijklmnoprstuvwxyz0123456789_!@#$%&*";

        System.out.println("str.length() = " + str.length());


        String password="";

        Random random= new Random();

        int ramdomIndex;

        for (int i = 0; i < 8; i++) {
            ramdomIndex= random.nextInt(str.length());
            password += str.charAt(ramdomIndex);
        }

        System.out.println("password = " + password);


    }
}
