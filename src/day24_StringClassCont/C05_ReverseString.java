package day24_StringClassCont;

public class C05_ReverseString {
    public static void main(String[] args) {
        String name = "kayak";
        //temhA
        String reverse="";

        for (int i = name.length()-1; i >= 0; i--) {
            reverse+=name.charAt(i);
            System.out.println("reverse = " + reverse);
        }

        System.out.println("reverse = " + reverse);

        System.out.println("name.equals(reverse) = " + name.equals(reverse));

    }

}
