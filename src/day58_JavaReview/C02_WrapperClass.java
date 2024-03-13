package day58_JavaReview;

public class C02_WrapperClass {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.substring(0, 2));



        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        String s = "29";
        System.out.println(Integer.parseInt(s) + 10);
        System.out.println(Integer.valueOf(s) + 10);

        String word = "ads698/**fff9663/sds";

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))){
                System.out.println(i+".nci karakter harftir");
            }else if (Character.isDigit(word.charAt(i))){
                System.out.println(i+".nci karakter rakamdır.");
            }else {
                System.out.println(i+".nci karakter özel karakterdir.");
            }
        }
    }
}
