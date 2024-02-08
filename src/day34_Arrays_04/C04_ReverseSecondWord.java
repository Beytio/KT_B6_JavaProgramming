package day34_Arrays_04;

public class C04_ReverseSecondWord {
    public static void main(String[] args) {

        System.out.println("reverseSecondWord(\"Ali okula gitti\") = " + reverseSecondWord("Ali okula gitti"));
        System.out.println(reverseSecondWord("Java öğrenmek çok güzel"));
    }
    // girilen cümledeki ikinci kelimeyi terse çeviren metodu yazınız
    //Ali okula gitti  --- Ali aluko gitti
    // Java öğrenmek çok güzel   --  Java kemnerğö çok güzel

    public static String reverseSecondWord(String cumle){
        String[] kelimeler = cumle.split(" ");   // {"Ali", "okula","gitti"}

        String ikinciKelime = kelimeler[1];
        String tersEdilmisIkinciKelime = reverseWord(ikinciKelime);

        kelimeler[1] = tersEdilmisIkinciKelime;
        String result = "";
        for (int i = 0; i < kelimeler.length ; i++) {
            result+= kelimeler[i]+" ";
        }

        return result;
    }

    public static String reverseWord(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
