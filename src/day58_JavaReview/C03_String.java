package day58_JavaReview;

public class C03_String {
    public static void main(String[] args) {
        String str =   "Ali";  //literal way  - string pool
        String str2 = "Ali";  // üsttekini pooldan işaret ediyor.
        String str1 = new String("Ali");
        String str3 = new String("Ali");

        System.out.println(str==str2);// true
        System.out.println(str==str1); // false
        System.out.println(str3==str1); // false
        // literal way new keyworde göre daha hızlıdır.

        System.out.println(str.equals(str3));  //true

        //immutable -- değiştirilemez...
        String s =   "java";  //literal way  - string pool
        System.out.println(s.toUpperCase());
        System.out.println(s);

        //StringBuilder ve StringBuffer aynı String class gibidir..
        //ilave bazı metodları vardır.
        //immutable değildir. mutable yani değişir..
        ///StringBuilder ve StringBuffer'da literal way yoktur.

        StringBuilder stringBuilder = new StringBuilder("Selenium");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Postman");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuilder.append("Selenium");
        System.out.println(stringBuilder);


    }
}
