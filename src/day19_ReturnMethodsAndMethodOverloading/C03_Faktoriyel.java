package day19_ReturnMethodsAndMethodOverloading;

public class C03_Faktoriyel {
    public static void main(String[] args) {

        System.out.println(faktoryelHesaplama(5));
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

    // girilen sayının faktoryelini veren metodu yazınız...

    public static int faktoryelHesaplama(int x){
        int sonuc = 1;
        for (int i = 1; i <=x ; i++) {
            sonuc*=i;
        }

        return sonuc;
    }


}
