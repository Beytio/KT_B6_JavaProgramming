package day28_StringPractice;

public class C06_RemoveDuplicate {

    public static void main(String[] args) {
/*
    Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String


     */

        String str = "AABBCCBCKKGHHT";

        System.out.println("removeDuplicate(\"AABBCCBCKKGHHT\") = " + removeDuplicate("AABBCCBCKKGHHT"));

        System.out.println(removeDuplicate("Ankara"));


    }

    public static String removeDuplicate(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);
            if (!result.contains(ch))
                result += ch;
        }
        return result;
    }
}
