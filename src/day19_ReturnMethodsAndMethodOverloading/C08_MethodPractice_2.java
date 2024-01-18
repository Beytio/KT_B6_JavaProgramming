package day19_ReturnMethodsAndMethodOverloading;

public class C08_MethodPractice_2 {

    public static void main(String[] args) {
        concatOrPrint("Arzu",11,false);
        System.out.println("-----------------");
        concatOrPrint("Arzu",11,true);
        System.out.println("-----------------");
        String str =concatNameAndAge("Veli",45);
        System.out.println("str = " + str);
    }

    //Bir method yazın 3 parametreli olsun. İnt ve String type
    //ve birde boolean. Boolean true ise int ve String değeri
    //concat yapsın. False ise başka bir methodu çağırsın ve
    //String değeri int kadar yazdırsın.

    public static void concatOrPrint(String isim, int yas, boolean bl){
        if (bl){
            System.out.println(isim+yas);
        }else {
           yasKadarYazdirma(isim,yas);
        }
    }

    public static void yasKadarYazdirma(String isim, int yas){
        for (int i = 1; i <=yas ; i++) {
            System.out.println(isim);
        }
    }

    public static String concatNameAndAge(String  isim, int yas){
        String sonuc = isim+yas;
        return sonuc;
    }
}
