package day28_StringPractice;

public class C08_Practice {

    public static void main(String[] args) {

        String str="ANKARA";

        System.out.println("str.length() = " + str.length());

        System.out.println("str.lastIndexOf(4) = " + str.lastIndexOf(4));

        System.out.println("str.lastIndexOf(\"C\") = " + str.lastIndexOf("C"));

        System.out.println("str.isEmpty() = " + str.isEmpty());

        System.out.println(str.isBlank());

        System.out.println("str.substring(0,5) = " + str.substring(0, 5));
    }
}
