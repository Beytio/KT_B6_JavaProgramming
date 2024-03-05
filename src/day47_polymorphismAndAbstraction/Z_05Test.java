package day47_polymorphismAndAbstraction;

public class Z_05Test {
    public static void main(String[] args) {
        Z03_EmirdagLisesi emirdagLisesi = new Z03_EmirdagLisesi();
        emirdagLisesi.temizlik();
        System.out.println(emirdagLisesi.ilceMilliEgitim());
        System.out.println(emirdagLisesi.ilMilliEgitim());
        System.out.println(emirdagLisesi.mudur());
        emirdagLisesi.dersler();
        emirdagLisesi.ogtrenciListe();

        emirdagLisesi.yemekListesi();

         // Z01_Okul_Vilayet okulVilayet = new Z01_Okul_Vilayet(); //CTE verir.

        Z01_Okul_Vilayet okulVilayet = new Z03_EmirdagLisesi();

        System.out.println("((Z03_EmirdagLisesi) okulVilayet).yemekListesi() = " + ((Z03_EmirdagLisesi) okulVilayet).yemekListesi());


    }
}
