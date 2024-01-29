package day26_String_Lab;

public class C02_ChangeSpace {
    public static void main(String[] args) {
        String s = "   Merhaba    dünya   ";
        System.out.println("changeSpace(s) = " + changeSpace(s));
    }

    /*
    Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    Merhaba dünya --> Merhaba%dünya
     */

    public static String changeSpace(String sentence){
        return sentence.replace(" ","%");
    }
}
