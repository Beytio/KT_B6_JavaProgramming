package day05_Week1_review;

public class C04_Tasks {
    public static void main(String[] args) {
        //eşit kenar üçgenin bir kenarı 5 cm ise
        //çevresi kaç cm dir
        // ekrana üçgenin çevresi ... "cmdir yazı"nız

        int kenarUzunlugu=5;
        int kenar=3;
        int cevre=kenar*kenarUzunlugu;

        System.out.println(cevre);

        System.out.println("üçgenin çevresi "+cevre+" cm dir.");


        //ogrencinin adı Harun, öğretmenin adı ise Leyla dır,
        // bu isimleri bir değişkene atayarak değişkeni
        // Leyla Öğretmen Harun'a "Aferin" dedi.


        String ogrencininAdi="Furkan";
        String ogretmeninAdi="Leyla";

        System.out.println(ogretmeninAdi+" Öğretmen "+ogrencininAdi+"'a \"Aferin\" dedi.");



         /*
        Emel 8 yaşında, Fatih Emelden 7 yaş büyüktür.
        Salih Fatihden 5 yaş küçük ise salihin yaşı kaçtır.
         */


        int emelAge=8;
        int fatihAge=emelAge+7;
        int salihAge=fatihAge-5;

        System.out.println("Salih'in yaşı "+salihAge+" dir.");






    }
}
