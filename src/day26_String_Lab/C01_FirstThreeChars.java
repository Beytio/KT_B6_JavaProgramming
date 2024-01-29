package day26_String_Lab;

public class C01_FirstThreeChars {
    public static void main(String[] args) {
        String str = "Ayasofya";
        System.out.println("firstThree(str) = " + firstThree(str));

        str =firstThree(str).toUpperCase().repeat(5);
        System.out.println("str = " + str);
    }
    /*
    Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 harften az
    ise inputu döndüren bir metot yazınız.
    Merhaba Mer
    Ali Ali
     */

    public static String firstThree(String word){
        if (word.length()<=3){
            return word;
        }
        return word.substring(0,3);
    }
}
