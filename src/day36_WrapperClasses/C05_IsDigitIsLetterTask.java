package day36_WrapperClasses;

public class C05_IsDigitIsLetterTask {
    public static void main(String[] args) {
        String str ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%" +
                "//'9a+%^^^((b*><###a678* +%&&/))<+J>>>>**56a##v**||;;;~~a~>>> " +
                "4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n**-<<|||>>012345l679--a**" +
                "//##++34r``~~((ı[234]+||";

        String letters = "";
        String digits = "";
        String specialCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                letters += str.charAt(i);
            }  else if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            } else {
                specialCharacters += str.charAt(i);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
