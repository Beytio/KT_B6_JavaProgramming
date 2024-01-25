package day24_StringClassCont;

public class C07_UniqueChars {
    public static void main(String[] args) {

      //  System.out.println("uniqueChars(\"şekerlik\") = " + uniqueChars_1("şekerlikli"));
        System.out.println("uniqueChars_1(\"Malatya\") = " + uniqueChars_1("Malatya"));


    }
    // bir metod yazalım.. parametre olarak girilen kelimedeki unique (tek) olan harfleri bize dönsün

    //Malatya---Mlty
    //şekerlik---şrli

    public static String uniqueChars(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch) == word.lastIndexOf(ch)) {
                result += word.charAt(i);
            }
        }
        return result;
    }

    public static String uniqueChars_1(String word) {
        String result = "";

        while (!word.isEmpty()) {

            String ch = word.substring(0, 1);
            if (word.indexOf(ch) != word.lastIndexOf(ch)) {
                word = word.replaceAll(ch, "");
            } else {
                result += ch;
                word = word.replaceAll(ch, "");
            }
        }

        return result;
    }


}
