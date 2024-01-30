package day27_String_Lab_Cont;

public class C05_RemoveRepeated {
    public static void main(String[] args) {
        System.out.println("removeRepeated(\"Merhaba\") = " + removeRepeated("Merhaba"));
        System.out.println("removeRepeated(\"Ananas\") = " + removeRepeated("Ananas"));

        System.out.println("removeRepeated_2(\"Ananas\") = " + removeRepeated_2("Ananas"));

        System.out.println("removeRepeated_2(\"SaklSlkstrsssnkms\") = " + removeRepeated_2("SaklSlkstrsssnkms"));
    }
    /*
    Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    Merhaba Merhab
    Ananas Anas   Anas

     */

    public static String removeRepeated(String str){
        String result = "";
        for (int i =0; i<str.length();i++){
            if (!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        return result;
    }
    //Ananas
    //nanas
    //aas
    //s
    //-
    public static String removeRepeated_2(String str){
        String result = "";
       while (!str.isEmpty()){
           result += str.substring(0,1);
           str = str.replace(str.substring(0,1),"");
       }
        return result;
    }
}
