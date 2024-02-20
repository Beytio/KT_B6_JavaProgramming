package day42_staticAndInheritance;

public class UniversiteOgrenciTest {
    public static void main(String[] args) throws ClassNotFoundException {
        UniversiteOgrenci ogrenci1 = new UniversiteOgrenci();

 //       Class.forName("day42_staticAndInheritance.UniversiteOgrenci");

        ogrenci1.bolumAdi ="İktisat";
        ogrenci1.setAdiSoyadi("Numan Karaca");
        ogrenci1.setTelNo("05462589897");
        ogrenci1.setDogumYili(2004);
        ogrenci1.setKutuphaneSifresi();
        System.out.println(ogrenci1.setKutuphaneSifresi());


        UniversiteOgrenci ogrenci2 = new UniversiteOgrenci();
        ogrenci2.bolumAdi ="Ekonometri";
        ogrenci2.setAdiSoyadi("Hale Açıkgöz");
        ogrenci2.setTelNo("05055856568");
        ogrenci2.setDogumYili(2002);
        ogrenci2.setKutuphaneSifresi();


        System.out.println(ogrenci2.setKutuphaneSifresi());

        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println("ogrenci2 = " + ogrenci2);

        UniversiteOgrenci.kutuphaneKullanimi(ogrenci2);


        UniversiteOgrenci ogrenci3 = new UniversiteOgrenci();
        UniversiteOgrenci ogrenci4 = new UniversiteOgrenci();

    }
}
