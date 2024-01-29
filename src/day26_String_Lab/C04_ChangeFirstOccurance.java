package day26_String_Lab;

public class C04_ChangeFirstOccurance {
    public static void main(String[] args) {

        System.out.println( changeFirst("Merhaba", "a", "e"));
        String str = "Kasaba";
        String ch1 = "a";
        String ch2 = "i";
        System.out.println("changeFirst(str,ch1,ch2) = " + changeFirst(str, ch1, ch2));

    }
    /*
    Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
    yazınız.
    (Merhaba ,a, e) Merheba
    (Kasaba , a, i) Kisaba
     */

    public static String changeFirst(String kelime, String eski, String yeni){
        return kelime.replaceFirst(eski,yeni);
    }
}
