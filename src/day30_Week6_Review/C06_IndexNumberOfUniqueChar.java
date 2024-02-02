package day30_Week6_Review;

public class C06_IndexNumberOfUniqueChar {

    //eğer indexOf ile lastIndexOf eşit ise o char'dan 1 tane vardır. Yani uniquedir.
    public static void main(String[] args) {

        String str = "AAAbGhhb";

        System.out.println("str.indexOf('X') = " + str.indexOf('X'));//-1

        //index number: int

        /*
        Eğer String içinde herbir karaktere(char) ulaşmak istiyorsak
        1) For loop
        2)charAt() metodunu kullan
         */

        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("ch = " + ch);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                index=str.indexOf(ch);
            }
        }
        System.out.println(index);
    }
}
