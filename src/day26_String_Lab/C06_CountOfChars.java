package day26_String_Lab;

public class C06_CountOfChars {
    public static void main(String[] args) {
        String str = "Ankara";
        char ch = 'A';
        String c = "A";

        System.out.println("countOfChars(str,ch) = " + countOfChars(str, ch));

        System.out.println("countOfChars(str,c) = " + countOfChars(str, c));

        System.out.println("countOfChars(\"Haymana\",\"A\") = " + countOfChars("Haymana", "A"));

        char a = 'a';
        System.out.println(a+20);
        System.out.println(a+'b');
        System.out.println(""+a+'b');
    }

    /*
    Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    edilecek)
    Ankara,a 3
    Edirne,e 2

     */

    public static int countOfChars(String str, char ch) {
        String chNew = ch + "";
        chNew = chNew.toLowerCase();
        System.out.println("chNew = " + chNew);
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(chNew)) {
                count++;
            }
        }


        return count;
    }

    public static int countOfChars(String str, String ch){
        str = str.toLowerCase();
        ch = ch.toLowerCase();

        int ilkBoy = str.length();      //araba  5
        int sonBoy = str.replace(ch,"").length();  //rb    2

        return ilkBoy - sonBoy;
    }
}
