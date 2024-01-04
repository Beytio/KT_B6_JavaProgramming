package day08_ScannerAndOperators;

public class C01_NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String firstname="Ahmet";
        String lastName="Suat";

        firstname="Ayşe";


        int num1=10;

        System.out.println(firstname+" "+ lastName);
        System.out.println(firstname.toUpperCase());



        String text      =    "Buyuk harfe"        +" Ingilizce'de"+" Capital Letter"+" denir"        ;
        System.out.println(text);

        String not="not";
        String Not="Variable isimlendirmelerinde buyuk harfle başlamak tavsiye edilmez ama java kabul eder";
    //    String not ="not2"; Birkere tanımlanan bir değişken tekrar tanımlanamaz
        not="not değil";
        String noT ="isimler farklı olursa java kabul eder";

    }
}
//name convention : degisken isimleri kucuk harfle baslar, sonraki kelimeler bitisik ve Buyuk harfle baslar
//                  camelCase
//fullName, lastName, sinifNumarasi,
//Classlarda CamelCase Class isimleri buyuk harfle baslar
//NonPrimitiveDataTypes.class
