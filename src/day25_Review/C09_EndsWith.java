package day25_Review;

public class C09_EndsWith {
    public static void main(String[] args) {
        String str = "Konya";

        System.out.println("str.endsWith(\"ya\") = " + str.endsWith("ya"));  //true
        System.out.println("str.endsWith(\"a\") = " + str.endsWith("a")); // true
        System.out.println("str.endsWith(\"\") = " + str.endsWith(""));  // true
        System.out.println("str.endsWith(\" \") = " + str.endsWith(" "));  // false

        System.out.println("str.startsWith(\"Ko\") = " + str.startsWith("Ko"));
        System.out.println("str.startsWith(\"ko\") = " + str.startsWith("ko"));
    }
}
