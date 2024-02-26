package day46_finalAndHiding;

public class C03_AvciKuslar extends C02_Kuslar{

    String ad = "Adsız";
    String  renk = "Rengi belli değil";

    protected void hareket() {
        System.out.println("uçarlar");
    }

    protected void beslenme() {
        System.out.println("et yerler");
    }

    protected void gaga() {
        System.out.println("sivri gagalıdır");
    }

    protected void pence(){
        System.out.println("penceleri vardır");
    }

}
