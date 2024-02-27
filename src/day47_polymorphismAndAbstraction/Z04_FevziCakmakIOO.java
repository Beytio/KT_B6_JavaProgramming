package day47_polymorphismAndAbstraction;

public class Z04_FevziCakmakIOO extends Z02_Okul_Emirdag{

    @Override
    public String mudur() {
        return "Hafize Baytar";
    }
   // public abstract String mudurYrd();  abstract method concrete classta bulunamaz..
    @Override
    public void ogtrenciListe() {
        System.out.println("F.Çakmak öğrenci listesi");
    }

    @Override
    public void dersler() {
        System.out.println("F.Çakmak ders programı");
    }

    @Override
    public String guvenlikIsimTC() {
        return null;
    }

    @Override
    public String devamsizlik() {
        return null;
    }
}
