package day25_Review;

public class C10_Match {
    public static void main(String[] args) {
        String str = "Afyonkarahisar";

        System.out.println("str.matches(\"Afyonkarahisar\") = " + str.matches("Afyonkarahisar"));
        System.out.println("str.matches(\"Afyon\") = " + str.matches("Afyon"));
        System.out.println("str.matches(\"Afyon(.*)\") = " + str.matches("Afyon(.*)"));
        System.out.println("str.matches(\"(.*)hisar\") = " + str.matches("(.*)hisar"));
    }
}
