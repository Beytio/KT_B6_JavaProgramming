package day26_String_Lab;

public class C05_WriteThreeTimes {
    public static void main(String[] args) {
        String s = "Merhaba";
        System.out.println("tekrarla(\"Ali\") = " + tekrarla("Ali"));
        System.out.println("tekrarla(\"Merhaba\") = " + tekrarla("Merhaba"));
        System.out.println("tekrarla(s,5) = " + tekrarla(s, 5));
        System.out.println("tekrarla_2(s) = " + tekrarla_2(s));
        System.out.println("tekrarla_3(s,5) = " + tekrarla_3(s, 5));
        System.out.println("tekrarla_3(\"Ayvansaray\",20) = " + tekrarla_3("Ayvansaray", 20));
        System.out.println("tekrarla_4(\"Ahmet\",8) = " + tekrarla_4("Ahmet", 8));

    }
    /*
    Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    Merhaba MMMeeerrrhhhaaabbbaaa
    Ali AAAllliii

     */

    public static String tekrarla (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static String tekrarla (String str , int adet){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static String tekrarla_2 (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result+=""+str.charAt(i)+str.charAt(i)+str.charAt(i);
        }
        return result;
    }

    public static String tekrarla_3 (String str, int adet){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
           result+=str.substring(i, i + 1).repeat(adet);
        }

        return result;
    }

    public static String tekrarla_4 (String str, int adet){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
           String character = str.substring(i, i + 1);
            for (int j = 0; j < adet; j++) {
                result+=character;
            }
        }

        return result;
    }
}
