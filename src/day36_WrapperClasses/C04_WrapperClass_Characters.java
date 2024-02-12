package day36_WrapperClasses;

public class C04_WrapperClass_Characters {
    public static void main(String[] args) {
        /*
        Character.isLetter()   --- karakterin harf olup olmadığını kontrol eder
        Character.isDigit()   --- karakterin rakam olup olmadığını kontrol eder
        Character.isAlphabetic()   --- karakterin harf olup olmadığını kontrol eder
        Character.isLetterOrDigit()   --  karakterin harf ya da rakam olup olmadığını kontrol eder
         */

        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        System.out.println("Character.isDigit('l') = " + Character.isDigit('l'));
        System.out.println("Character.isAlphabetic('d') = " + Character.isAlphabetic('d'));
        System.out.println("Character.isLetterOrDigit('3') = " + Character.isLetterOrDigit('3'));


        String str = "34+&#$½4j/*+a5345%+^'~~v5222/*++-+)({[]}a";

        String message = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                message += str.charAt(i);
            }
        }
        System.out.println("message = " + message);

        String tarih ="12/02/2024 22:12:55";  //12022024551222
        String[] tarihArr = tarih.split(" ");
        String[] saatArr = tarihArr[1].split(":");
        String saatDuzenle="";
        for (int i = saatArr.length - 1; i >= 0; i--) {
            saatDuzenle += saatArr[i];
        }

        System.out.println("saatDuzenle = " + saatDuzenle);
        String tarihDuzenle ="";
        for (int i = 0; i < tarihArr[0].length(); i++) {
            if (Character.isDigit(tarihArr[0].charAt(i))){
                tarihDuzenle += tarihArr[0].charAt(i);
            }
        }

        String tarihDamgasi = tarihDuzenle+saatDuzenle;

        System.out.println("tarihDamgasi = " + tarihDamgasi);
    }
}
