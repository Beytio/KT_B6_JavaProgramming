package day28_StringPractice;

public class C02_Replace {

    public static void main(String[] args) {

        String str= "Dog Cat";

        str.replace("Cat","Dog");

        //System.out.println("str = " + str);

        str.replaceFirst("Dog","Tiger");

        System.out.println("str = " + str);

        System.out.println(str.endsWith("Dog"));
        System.out.println(str.startsWith("Dog"));


    }
}
