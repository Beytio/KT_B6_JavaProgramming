package day27_String_Lab_Cont;

public class C03_StartEndEqual {
    public static void main(String[] args) {

        System.out.println("startEndEqual(\"Ankara\") = " + startEndEqual("Ankara"));
        System.out.println("startEndEqual(\"Kafka\") = " + startEndEqual("Kafka"));
        System.out.println(startEndEqual("Asdkdkfksdfkdfkfdsk sdfdsfdsfdsfds fdsfkfdsfdsfl as"));

        System.out.println(startEndEqual_1("Ankara"));
        System.out.println(startEndEqual_1("Kuzgunku"));
    }
    /*
    Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    almıyorsa false yazdırın.
    Ankara false   //6   6-2 =4
    Kafka true
    Salsa true
    Saksı false

     */

    public static boolean startEndEqual (String str){
        String firstTwo = str.substring(0,2);
        String lastTwo = str.substring(str.length()-2);

        boolean result = firstTwo.equalsIgnoreCase(lastTwo);

        return result;
    }

    public static boolean startEndEqual_1 (String str){
      return str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }


}
