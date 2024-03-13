package day58_JavaReview;

public class C04_ReverseString {
    public static void main(String[] args) {

        String s = "Ben bugün bakkala gittim";
        System.out.println("s = " + s);

        System.out.println("reverseString(s) = " + reverseString(s));
        System.out.println("reverseString1(s) = " + reverseString1(s));
        System.out.println("reverseString2(s) = " + reverseString2(s));
        System.out.println("reverseString3(s) = " + reverseString3(s));
        System.out.println("reverseString4(s) = " + reverseString4(s));
        System.out.println("reverseString5(s) = " + reverseString5(s));


    }
    // stringi ters çeviren metodu yazınız

    public static String reverseString(String str){
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    public static String reverseString1(String str){
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
           reversed += str.substring(i,i+1);
        }
        return reversed;
    }

    public static String reverseString2(String str){
        String reversed = "";

        while (str.length()!=0){
            reversed +=str.charAt(str.length()-1);
            str = str.substring(0,str.length()-1);
        }
        return reversed;
    }

    public static String reverseString3(String str){
        String reversed = "";

        while (!str.isEmpty()){
            int length = str.length();
            reversed +=str.substring(length-1,length);
            str = str.substring(0,str.length()-1);
        }
        return reversed;
    }

    public static String reverseString4(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String reversed = sb.toString();

        return reversed;
    }

    public static String reverseString5(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
