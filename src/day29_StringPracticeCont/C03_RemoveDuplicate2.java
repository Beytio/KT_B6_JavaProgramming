package day29_StringPracticeCont;

public class C03_RemoveDuplicate2 {

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

        String str = "ABCC";

        System.out.println(removeDuplicate(str));

//        System.out.println("str.indexOf('G') = " + str.indexOf('G'));
//        System.out.println(str.indexOf('X'));// eğer o harf stringde yoksa, indexOf metodu -1 döner.


    }

    public static String removeDuplicate(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch)==-1)
                result += ch;
        }
        return result;
    }
/*
i=0  str.charAt(0) --> ch='A'  result.indexOf('A')==-1 ---> A yok öyleyse EKLE   result="A";
i=1  str.charAt(1) --> ch='B'  result.indexOf('B')==-1 ---> B yok öyleyse EKLE result="AB";
i=2  str.charAt(2) --> ch='C'  result.indexOf('C')==-1 ---> C yok öyleyse EKLE result="ABC";
i=3  str.charAt(3) --> ch='C'  result.indexOf('C')== 2 ---> C var öyleyse EKLEME result="ABC";
 */

    }

