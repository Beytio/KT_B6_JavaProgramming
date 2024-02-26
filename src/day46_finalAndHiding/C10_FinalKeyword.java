package day46_finalAndHiding;

public class C10_FinalKeyword {

    /*
    final class --- parent olamaz.. yani extend edilemez
    final method --- override edilemez yani child classlarda iptal edilerek güncellenemez
    final variable --- değeri değiştirelemez.
     */

    public final String MARKA ;

    /*
    final variable'lara 3 yol ile değer atanır. değer atanmayan final variable
    OLAMAZ. mutlaka değer atanmalıdır.
    1- Aynı satırda değer atanır
    2- Constructorda atanır
    3- instance blokta atanır
    Genellikle final variable'lar buyuk harfle yazılır.
     */

    public C10_FinalKeyword() {
        MARKA = "Beko";
    }

    public C10_FinalKeyword(String str) {
        MARKA = "Beko";
    }

    public static void main(String[] args) {
        C10_FinalKeyword obj = new C10_FinalKeyword();
    }
}
