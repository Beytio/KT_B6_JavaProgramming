package day27_String_Lab_Cont;

public class C01_ControlTheStarting {
    public static void main(String[] args) {

        System.out.println("controlOfString(\"Kinlenmek\") = " + controlOfString("Kinlenmek"));
        System.out.println("controlOfString(\"Kin tutmak\") = " + controlOfString("Kin tutmak"));
        System.out.println("controlOfString(\"Ekin ektim\") = " + controlOfString("Ekin ektim"));
        System.out.println("controlOfString(\"Keskin ilçesinden geçiyorum\") = " + controlOfString("Keskin ilçesinden" +
                " geçiyorum"));

        System.out.println("controlOfString(\"Akşam erken iner mapushaneye\",\"Ak\") = " + controlOfString("Akşam " +
                "erken iner mapushaneye", "Ak"));
        System.out.println("controlOfString(\"Hayat güzeldir\",\"yat\") = " + controlOfString("Hayat güzeldir", "yat"));

        System.out.println("controlOfString_1(\"Saman\",\"Sam\") = " + controlOfString_1("Saman", "Sam"));

        System.out.println("controlOfString_1(\"Afyonkarahisar\",\"fyon\") = " + controlOfString_1("Afyonkarahisar",
                "fyon"));
    }

    /*
    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    Kinlenmek true
    Kin tutmak true
    Ekin ektim true
    Keskin ilçesinden geçiyorum false
    Neden kin tutuyorsun false

     */

    public static boolean controlOfString(String str) {
        String control = "Kin";
        control = control.toLowerCase();
        str = str.toLowerCase();

        if (str.startsWith(control)) {
            return true;
        } else if (str.substring(1).startsWith(control)) {
            return true;
        }

        return false;

    }

    public static boolean controlOfString(String str,String control) {
        control = control.toLowerCase();
        str = str.toLowerCase();

        if (str.startsWith(control)) {
            return true;
        } else if (str.substring(1).startsWith(control)) {
            return true;
        }

        return false;

    }

    public static boolean controlOfString_1(String str,String control) {
        control = control.toLowerCase();
        str = str.toLowerCase();

       return str.startsWith(control) || str.substring(1).startsWith(control);
    }
}
