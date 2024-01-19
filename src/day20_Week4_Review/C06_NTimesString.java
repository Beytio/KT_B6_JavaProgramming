package day20_Week4_Review;

public class C06_NTimesString {
    public static void main(String[] args) {
        System.out.println(stringTimes("Ali", 4));

        System.out.println("stringTimes(\"Merhaba\",2) = " + stringTimes("Merhaba", 2));

        stringNTimes("ali",5);
    }

    public static String stringTimes(String s, int n){
        String result="";
        for (int i = 0; i < n; i++) {
           result+=s;
        }
        return result;
    }


    public static void stringNTimes(String s, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

}
 /*
        Given a string and a positive int n, return a string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
         */