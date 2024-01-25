package day24_StringClassCont;

public class C04_StartsWithEndsWith {
    public static void main(String[] args) {
        String  name = "Hafize";

        System.out.println("name.startsWith(\"H\") = " + name.startsWith("H"));
        System.out.println("name.startsWith(\"T\") = " + name.startsWith("T"));

        System.out.println("name.startsWith(\"Haf\") = " + name.startsWith("Haf"));


        System.out.println("name.endsWith(\"e\") = " + name.endsWith("e"));
        System.out.println("name.endsWith(\"ze\") = " + name.endsWith("ze"));

        System.out.println("name.startsWith(\"Hafize\") = " + name.startsWith("Hafize"));
        System.out.println("name.endsWith(name) = " + name.endsWith(name));

        System.out.println("name.endsWith(\"\") = " + name.endsWith(""));
    }
}
