package day19_ReturnMethodsAndMethodOverloading;

public class C02_MethodTasks_1 {

    public static void main(String[] args) {

        int sonuc = ikiSayiToplama(3,9);
        System.out.println("sonuc = " + sonuc);

        System.out.println(sonRakamAyniMi(1, 107));

    }



      /*
        metod oluştururken
        1- public/static yazılacak (şimdilik)
        2- bu metod bana ne verecek? veri ise return Type olacak (veri tipi) yoksa void olacak
        3- metod ismi verilir (camelCase)
        4- metod parentezi ()  --> eğer metodum çalışmak için veriye ihtiyaç duyuyorsa buraya
        bu veri için giriş parametresi sağlanır.
        5- metod body.si  // kod kısmı
        6- metod çağırılmalıdır.
         */

    // parametre olarak girilen iki sayıyı toplayan ve sonucu dönen metodu yazalım

    /**
     * girilen iki sayıyı toplayan ve sonucu dönen metod
     * @param sayi1
     * @param sayi2
     * @return
     */
    public static int ikiSayiToplama(int sayi1 , int sayi2){
      int toplam = sayi1 + sayi2;
  //      System.out.println(toplam);
      return toplam;
    }

    //Bir method yazın boolean değer dondursun ve 2 sayı
    //kabul etsin sayıların son rakamı aynı ise true farklı ise
    //false döndürsün..

    /**
     * son rakamları aynı mı?
     * @param sayi1
     * @param sayi2
     * @return
     */
    public static boolean sonRakamAyniMi(int sayi1, int sayi2){
        boolean ayniMi=false;
        if (sayi1 % 10 == sayi2 % 10){
            ayniMi=true;
        }

        return ayniMi;
    }

}
