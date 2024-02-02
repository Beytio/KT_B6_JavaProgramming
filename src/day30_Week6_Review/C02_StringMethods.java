package day30_Week6_Review;

public class C02_StringMethods {

    public static void main(String[] args) {

        String word = "Kahraman";
        //length()--> uzunluğunu verir
        //length()-1--> son indeksi verir.
        System.out.println(word.length());

        System.out.println("word.charAt(0) = " + word.charAt(0));

        System.out.println("word.charAt(7) = " + word.charAt(7));

        System.out.println("word.charAt(word.length()-1) = " + word.charAt(word.length() - 1));

        //System.out.println("word.toLowerCase() = " + word.toLowerCase());

//        word.toLowerCase();
//
//        System.out.println(word);

        System.out.println("word.indexOf('a') = " + word.indexOf('a')); //1
        System.out.println("word.lastIndexOf('a') = " + word.lastIndexOf('a'));

        System.out.println("word.indexOf('r') = " + word.indexOf('r'));
        System.out.println("word.lastIndexOf('r') = " + word.lastIndexOf('r'));




    }
}
