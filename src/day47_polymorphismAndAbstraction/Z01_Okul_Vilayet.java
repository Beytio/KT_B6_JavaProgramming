package day47_polymorphismAndAbstraction;

public abstract class Z01_Okul_Vilayet {
    public Z01_Okul_Vilayet() {
        System.out.println("İl Milli Eğitim Yeni Eğitim Yılında Başarılar Diler");
    }

    static String il = "Afyon";

    public static String ilMilliEgitim(){
        return "İl Müdürü Salih Koçak";
    }

    public abstract String mudur();

    public void temizlik(){
        System.out.println("Her sınıfa bir görevli olacaktır.");
        System.out.println("WC.ler her tenefüsten sonra temizlenecektir.");
        System.out.println("Hergün saç ve tırnak kontrolü yapılacaktır.");
    }

    public abstract void ogtrenciListe();

     abstract void dersler();

    public abstract int yardimIlce();

    public abstract String guvenlikIsimTC();

    public abstract String devamsizlik();
}
