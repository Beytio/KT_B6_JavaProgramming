package day41_encapsulation_and_staticKeyword;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class C05_BankaMusterisi {
    public final static String bankaAdi = "Garanti BBVA";

    private String adSoyad;
    private String hesapNo;
    private double bakiye;
    private static int musteriNo =1;
    private static String adminSifre;

    static {
        adminSifre = LocalDateTime.now().getDayOfMonth()+bankaAdi.substring(0,3);
    }

    {
        System.out.println("Her kayıt alınırken hesap no otomatik oluşturulacak");
    }

    public C05_BankaMusterisi() {
    }


    public void setAdSoyad(String adSoyad) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin şifreniz : ");
        String girilenSifre = scanner.nextLine();
        if(girilenSifre.equals(adminSifre)){
            this.adSoyad = adSoyad;
            System.out.println("Ad soyad değişikliği/girişi yapılmıştır.");
            return;
        }
        System.out.println("Ad soyad değişikliği/girişi YAPILAMAMIŞTIR.");
    }

    public void setHesapNo() {
        Random random = new Random();
       int randomSayi= random.nextInt(99999999)+1000000;
        String hesapNo = "TR"+musteriNo+randomSayi+"1256";
        this.hesapNo = hesapNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatirma(double miktar){
        bakiye+=miktar;
    }

    public void paraCekme(double miktar){
        if (miktar<bakiye){
            bakiye-=miktar;
        }else {
            System.out.println("Yetersiz bakiye");
        }
    }
        @Override
        public String toString() {
            return "C05_BankaMusterisi{" +
                    "adSoyad='" + adSoyad + '\'' +
                    ", hesapNo='" + hesapNo + '\'' +
                    ", bakiye=" + bakiye +
                    '}';

    }
}
