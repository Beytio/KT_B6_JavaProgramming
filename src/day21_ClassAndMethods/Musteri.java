package day21_ClassAndMethods;

public class Musteri {

    String ad;
    String soyad;
    String adres;
    int yas;
    String tcNo;

    public String sifre(){
        String  sifre =""+ ad.charAt(0)+yas+soyad.charAt(1)+tcNo;
        return sifre;
    }
}
