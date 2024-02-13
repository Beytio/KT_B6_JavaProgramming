package day37_ArrayList;

import java.util.Arrays;

public class C01_PracticeWrapper {
    public static void main(String[] args) {
        String str ="232dsfsdf++/**45)(5686)()(/)/(g546456fdgfd4645";

        System.out.println("sumOfNumbers(str) = " + sumOfNumbers(str));

        String str1 ="258 25 36 68 2 11 19 2587";

        System.out.println("sayiToplami(str1) = " + sayiToplami(str1));

    }
    //Girilen stringde bulunan rakamların toplamını veren metot nedir?

    public static int sumOfNumbers(String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                result+=Integer.parseInt(s.charAt(i)+"");
            }
        }
        return result;
    }

    //String str ="258 25 36 68 2 11 19 2587";
    // yukarıdaki stringde boşlukla ayrılan rakamların sayı değeri bulunarak küçükten
    // büyüğe doğru bir string içine alan metodu yazınız.
    // cevap String str ="2 2 7 9 10 14 15 22"

    public static String sayiToplami (String str){
        String result="";
        String[] strArr = str.split(" ");
        //"258" "25" "36" "68" "2" "11" "19" "2587"
        int [] kelimeTopArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            int toplam =0;
            for (int j = 0; j < strArr[i].length(); j++) {
                toplam += Integer.parseInt(strArr[i].charAt(j)+"");
            }
            kelimeTopArr[i] = toplam;
            toplam =0;
        }

        Arrays.sort(kelimeTopArr);  //küçükten büyüğe sıralandı

        for (int toplam : kelimeTopArr) {
            result+= toplam+" ";
        }

        return result.trim();
    }
}
