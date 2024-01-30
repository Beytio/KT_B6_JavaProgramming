package day27_String_Lab_Cont;

public class C02_CompleteToFive {
    public static void main(String[] args) {
        System.out.println("completeToFive(\"Kazak\") = " + completeToFive("Kazak"));
        System.out.println("completeToFive(\"Kazakistan\") = " + completeToFive("Kazakistan"));
        System.out.println("completeToFive(\"Kaz\") = " + completeToFive("Kaz"));
    }

    /*
    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    Sabun Sabun
    Merhaba Merha
    Ali Ali..
    Hey Hey..
    Pi Pi…

     */

    public static String completeToFive(String str){
        String result = "";
        if (str.length()>=5){
            result = str.substring(0,5);
        }
        else{
            for (int i =str.length() ; i <5; i++) {
                str+=".";
            }
            result = str;
        }

        return result;
    }
}
