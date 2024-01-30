package day26_String_Lab;

public class C07_RemoveChars {
    public static void main(String[] args) {

        String str = "Merhaba";
        char ch = 'a';

        System.out.println("removeChars(str,ch) = " + removeChars(str, ch));

        System.out.println("removeChars(\"Merhaba\",\"a\") = " + removeChars("Merhaba", "a"));


    }

    /*
    Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    kaldırılmış şekilde string döndüren programı yazınız.
    (Merhaba, a) Merhb

     */

    public static String removeChars(String str, char target) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String removeChars(String str, String target) {
        return str.replace(target,"");
    }
}
