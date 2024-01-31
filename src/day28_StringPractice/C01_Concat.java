package day28_StringPractice;

public class C01_Concat {
    public static void main(String[] args) {

        String a = "123";

        String b = 5 + 4 + a; //9123
        String c = a + 5 + 4; //12354
        String d = "5" + "4" + a; //54123

//    System.out.println("b = " + b);
//        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
