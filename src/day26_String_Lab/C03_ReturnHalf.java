package day26_String_Lab;

public class C03_ReturnHalf {
    public static void main(String[] args) {

        System.out.println("secondHalf(\"Sanayagı\") = " + secondHalf("Sanayagık"));
        System.out.println("secondHalf(\"ay\") = " + secondHalf("ay"));
        System.out.println("secondHalf(\"karaüzümhabbesiyiz\") = " + secondHalf("karaüzümhabbesiyiz"));

    }
    /*
    Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
    yazdırın.
    Sanayagı yagı  //8
    01234567       // index 7 de biter.
    Mutluluk uluk
     */

    public static String secondHalf(String word){
        if (word.length()%2==0){
            return word.substring(word.length()/2);
        }else {
            return word.substring(word.length()/2);
        }

    }

}
