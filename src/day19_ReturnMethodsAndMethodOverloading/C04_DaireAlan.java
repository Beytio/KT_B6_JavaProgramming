package day19_ReturnMethodsAndMethodOverloading;

public class C04_DaireAlan {
    public static void main(String[] args) {

       double sonuc= daireAlan(7);
        System.out.println("sonuc = " + sonuc);
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

    // yarı çapı parametre olarak alan ve sonuç olarak dairenin alanını veren kodu yazalım..

    public static double daireAlan(double radius){
        double alan = 3.14 * radius * radius;
        return alan;
    }
}
