package day19_ReturnMethodsAndMethodOverloading;

public class C08_MethodPractice {
    public static void main(String[] args) {
        System.out.println(operation("Ali", 3, true));
        operation("Ali",false,3);
    }
    //Bir method yazın 3 parametreli olsun. İnt ve String type
    //ve bir de boolean. Boolean true ise int ve String değeri
    //concat yapsın. False ise başka bir methodu çağırsın ve
    //String değeri int kadar yazdırsın.
    // overloading kullanarak...

    public static String operation(String str, int i , boolean b){
        String sonuc="";
        if (b){
           sonuc=str+i;
        }
        return sonuc;
    }

    public static void operation(String str, boolean b ,int i  ){

        if (!b){
           sayiKadarYazdirma(str,i);
        }

    }

    public static void sayiKadarYazdirma(String str, int i){
        for (int j = 1; j <= i; j++) {
            System.out.println(str);
        }
    }
}
