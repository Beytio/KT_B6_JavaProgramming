package day47_polymorphismAndAbstraction;

public class Z03_EmirdagLisesi extends Z02_Okul_Emirdag{


    @Override
    public String mudur() {
        return "Okul Müdürü Şeyhmus Karaca";
    }

    @Override
    public void ogtrenciListe() {
        System.out.println("Emirdağ lisesi öğrenci listesi");
    }

    @Override
    public void dersler() {
        System.out.println("Emirdağ lisesi ders programı");
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
