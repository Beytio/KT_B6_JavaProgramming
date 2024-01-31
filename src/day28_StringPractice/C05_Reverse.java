package day28_StringPractice;

public class C05_Reverse {

    public static void main(String[] args) {

        //#C nohtyP avaJ

        reverseString();
        reverseString("Java JAVA");
        reverseString("Yarın İstanbula gidiyorum");

        System.out.println(reversed());
        String str2=reversed();
        str2= str2.substring(0,3);
        System.out.println("str2 = " + str2);

        String str3= reversed().substring(0,3);
        System.out.println("str3 = " + str3);

        System.out.println("reversed(\"JavaScript Go C++\") = " + reversed("JavaScript Go C++"));

    }

    public static void reverseString() {
        String str = "Java Python C#";

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i); // reversed += str.charAt(i)
        }

        System.out.println("reversedStr = " + reversedStr);

    }

    public static void reverseString(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i); // reversed += str.charAt(i)
        }

        System.out.println("reversedStr = " + reversedStr);

    }

    public static String reversed() {
        String str = "Java Python C#";

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i); // reversed += str.charAt(i)
        }

        return reversedStr;
    }

    public static String reversed(String str) {

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i); // reversed += str.charAt(i)
        }

        return reversedStr;
    }



}
