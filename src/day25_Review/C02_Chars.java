package day25_Review;

public class C02_Chars {
    public static void main(String[] args) {
        basSonKontrol("esneme");
    }

    // bir metod yazalım ilk harfi ile son harfi aynı kelime girilse "Aynı" yazsın
    // ilk harfi ile son harfi farklıysa "Aynı değil" yazsın

    public static void basSonKontrol(String kelime){
        kelime = kelime.toLowerCase();

        char ilk = kelime.charAt(0);
        char son = kelime.charAt(kelime.length()-1);

        if (ilk==son){
            System.out.println("Aynı");
        }else {
            System.out.println("Aynı değil");
        }
    }
}
