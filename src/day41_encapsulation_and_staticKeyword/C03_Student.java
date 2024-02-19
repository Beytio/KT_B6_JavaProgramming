package day41_encapsulation_and_staticKeyword;

import java.util.Scanner;

public class C03_Student {

    public static String okulAdi = "Melik Gazi Orta Okulu";
    public static String mudur = "Hacı Arif Bey";

    private String adSoyad;
    private int okulNo;
    private String adres;
    private boolean yatiliMi;
    private char cinsiyet;
    private final String adminSifre = "melikgazi";

    static {
        System.out.println("Database bağlantısı açıldı");
    }

    {
        System.out.println("Açılan bağlantı yeni kayıt için hazır hale getirildi.");
    }

    public C03_Student() {
    }

    public C03_Student(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public C03_Student(String adSoyad, int okulNo, String adres) {
        this.adSoyad = adSoyad;
        this.okulNo = okulNo;
        this.adres = adres;
    }

    public C03_Student(String adSoyad, int okulNo, String adres, boolean yatiliMi, char cinsiyet) {
        this.adSoyad = adSoyad;
        this.okulNo = okulNo;
        this.adres = adres;
        this.yatiliMi = yatiliMi;
        this.cinsiyet = cinsiyet;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public String getAdres() {
        return adres;
    }

    public boolean isYatiliMi() {
        return yatiliMi;
    }

    public char getCinsiyet() {
        return cinsiyet;
    }

    public void setAdSoyad(String adSoyad) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci adı değiştirmek için lütfen admin şifresini giriniz :");
        String girilenSifre = scanner.nextLine();
        if (girilenSifre.equals(adminSifre)){
            this.adSoyad = adSoyad;
            System.out.println("Öğrenci adı başarıyla değiştirilmiştir.");
            return;
        }
        System.out.println("Öğrenci adı değiştirmeye yetkiniz yoktur.");
    }

    public void setOkulNo(int okulNo){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci nosunu değiştirmek için lütfen admin şifresini giriniz :");
        String girilenSifre = scanner.nextLine();
        if (girilenSifre.equals(adminSifre)){
            this.okulNo = okulNo;
            System.out.println("Öğrenci nosu başarıyla değiştirilmiştir.");
            return;
        }
        System.out.println("Öğrenci nosu değiştirmeye yetkiniz yoktur.");
    }

    public static void temizlikKurallari(){
        System.out.println(okulAdi+" müdürü "+mudur+" diyor ki;");
        System.out.println("Erkelerin saçları uzun olmayacak.");
        System.out.println("Kızlar saçını örecek.");
        System.out.println("Tırnaklar kesilecek");
    }

    public String kutuphaneSifresi(){
        return adSoyad.substring(0,4)+okulNo+okulAdi.substring(0,3);
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "adSoyad='" + adSoyad + '\'' +
                ", okulNo=" + okulNo +
                ", adres='" + adres + '\'' +
                ", yatiliMi=" + yatiliMi +
                ", cinsiyet=" + cinsiyet +
                ", müdür='" + mudur + '\'' +
                ", okul adı='"+ okulAdi+'\''+
                '}';
    }
}
