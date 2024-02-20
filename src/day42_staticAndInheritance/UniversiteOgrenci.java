package day42_staticAndInheritance;

import java.time.LocalDateTime;

public class UniversiteOgrenci {

    public final static String universiteAdi = "Afyon Kocatepe Üniversitesi";
    public String bolumAdi;
    private String adiSoyadi;
    private String telNo;
    private int dogumYili;
    private static String ogrenciIsleriSifre;

    private static int ogrenciKayitSirasi = 2141;

    static {
        ogrenciIsleriSifre = universiteAdi.substring(0,3)+LocalDateTime.now().getDayOfWeek();
        System.out.println(ogrenciIsleriSifre);
        System.out.println("Static blok çalıştı");
    }

    {
        ogrenciKayitSirasi++;
        System.out.println(ogrenciKayitSirasi);
        System.out.println("Instance blok çalıştı");
    }

    public UniversiteOgrenci() {
        System.out.println("Constructor çalıştı");
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        if (telNo.length()!=11) {
            System.out.println("Hatalı tel no girişi yaptınız..");
            return;
        }
        this.telNo = telNo;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        if (LocalDateTime.now().getYear()-dogumYili>25) {
            System.out.println("Universiteye kayıt hakkınız yoktur");
            return;
        }
        this.dogumYili = dogumYili;
    }

    public String  setKutuphaneSifresi(){
        return adiSoyadi.substring(adiSoyadi.length()-4)+ogrenciKayitSirasi+bolumAdi;
    }

    public static void kutuphaneKullanimi(UniversiteOgrenci ogrenci){
        System.out.println(universiteAdi+" "+ogrenci.bolumAdi+ " kütüphanesi sadece öğrencilere özeldir ve şifre ile kullanılır.");
    }

    @Override
    public String toString() {
        return "UniversiteOgrenci{" +
                "bolumAdi='" + bolumAdi + '\'' +
                ", adiSoyadi='" + adiSoyadi + '\'' +
                ", telNo='" + telNo + '\'' +
                ", dogumYili=" + dogumYili +
                '}';
    }
}
