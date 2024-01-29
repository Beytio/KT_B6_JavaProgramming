package day25_Review;

public class C07_Replace {
    public static void main(String[] args) {
        String str = "Java Java Java";
        str= str.replace("a","*");
        System.out.println("str = " + str);

        String str_1 = "Java Java Java";
        str_1= str_1.replace("va","**");
        System.out.println("str_1 = " + str_1);

        String  str_2 = "Java Java Java";
        str_2 = str_2.replace(" ","").replace("J","*").replace("*","+").substring(0,2);
        System.out.println("str_2 = " + str_2);

        String  str_3 = "Java Java Java";
        str_3= str_3.replaceFirst("Java","****");
        System.out.println("str_3 = " + str_3);

        String str_4 = "Java1 Java2 Java3";
        str_4 = str_4.replaceAll("[0-9]","");
        System.out.println("str_4 = " + str_4);

        String str_5 = "Java1 Java2 Java3";
        str_5 = str_5.replaceAll("[a-zA-Z]","");
        System.out.println("str_5 = " + str_5);
        // regular expression  ---> regex

        String str_6 = "Java/*+1 Java2&% Java/*+-/(3";
        str_6 = str_6.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str_6 = " + str_6);
    }
}
