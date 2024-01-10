package day11_ControlFlowStatement_IF;

public class C06_If_ElseIf_Else {
    public static void main(String[] args) {
        /*
        bir sayı değişkeni tanımlayalım.. bu sayının pozitif/negatif/sıfır olma durumunu kontrol edip yazdıralım..
         */

        int sayi = 51;

        if (sayi>0){
            System.out.println("Pozitiftir.");
        } else if (sayi <0) {
            System.out.println("Negatiftir.");
        }else {
            System.out.println("Sayı sıfırdır.");
        }


        System.out.println("---------------------");

        // not if - else if - else bloklarından sadece biri çalışır. iki blok asla çalışmaz..
        if (sayi>0){
            System.out.println("Pozitiftir.");
        } else if (sayi >10) {
            System.out.println("Ondan büyüktür.");
        }else {
            System.out.println("Sayı sıfırdır.");
        }

        System.out.println("---------------------");

        // A ve B iki adet int sayı olsun
        // Bunları karşılaştıralım
        // A büyükse "A büyüktür", B büyükse "B büyüktür" yazdıralım
        // eğer işit iseler "Rakamlar eşittir" yazdıralım..

        int a = 70;
        int b = 70;

        if (a>b){
            System.out.println("A büyüktür.");
        } else if (a==b) {
            System.out.println("Rakamlar eşittir");
        } else {
            System.out.println("B büyüktür");
        }


       // aynı soruyu x ve y ile yapalım
        int x = 70;
        int y = 90;

        if (x>y){
            System.out.println("x büyüktür.");
        } else if (y>x) {
            System.out.println("y büyüktür");
        } else if (x==y) {
            System.out.println("rakamlar eşittir..");
        }


    }
}
