package day46_finalAndHiding;

public class C05_TestHayvanlar {
    public static void main(String[] args) {
        C04_KumesKuslari tavuk = new C04_KumesKuslari();
        System.out.println(tavuk.ad); //Bizim kümesin üyeleri
        System.out.println(tavuk.renk); //null

        tavuk.hareket(); //yürür
        tavuk.beslenme(); // et ve ot yer
        tavuk.kanat(); //kanatlıdır
        tavuk.cogalma(); // yumurta
        tavuk.gaga();  //gagaları vardır
        tavuk.omur();  // yasar ve olurler
        tavuk.solunum(); // akciğer solunumu yaparlar

        C02_Kuslar kus = new C02_Kuslar();
        System.out.println(kus.ad); //Adı belirtilmemiş
        System.out.println(kus.renk); //null

        kus.hareket(); //hareket ederler
        kus.beslenme(); // beslenirler
        kus.kanat(); //kanatlıdır
        kus.cogalma(); // yumurta
        kus.gaga();  //gagaları vardır
        kus.omur();  // yasar ve olurler
        //kus.pence(); CTE
        kus.solunum(); // akciğer solunumu yaparlar
    }
}
