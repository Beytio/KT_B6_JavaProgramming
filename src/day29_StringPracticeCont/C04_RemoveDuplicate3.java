package day29_StringPracticeCont;

public class C04_RemoveDuplicate3 {

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

        String str = "CABC";

        System.out.println(removeDuplicate(str));

    }

    public static String removeDuplicate(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = ""+ str.charAt(i);
            if (result.contains(ch)){
                continue;
            }
            result +=ch;
        }

        return result;
    }


    }

