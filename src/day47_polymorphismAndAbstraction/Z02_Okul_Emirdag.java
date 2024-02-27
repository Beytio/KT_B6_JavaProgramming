package day47_polymorphismAndAbstraction;

public abstract class Z02_Okul_Emirdag extends Z01_Okul_Vilayet{

    public String ilceMilliEgitim(){
        return "İlçe Müdürü Hanife Gemalmaz";
    }
    public abstract String mudur();

    public abstract void ogtrenciListe();

    public abstract void dersler();

    public int yardimIlce(){
        int toplamYardim = 100000;
        return toplamYardim;
    }
}
