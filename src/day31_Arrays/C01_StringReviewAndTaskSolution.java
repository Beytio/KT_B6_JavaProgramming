package day31_Arrays;

public class C01_StringReviewAndTaskSolution {
    public static void main(String[] args) {
//        System.out.println("harfleriSay(\"Ankaran\") = " + harfleriSay("Ankaran"));
//        System.out.println("enCokHarf(\"Merhaba\") = " + enCokHarf("Merhaba"));
        System.out.println(enCokHarf("inkakuşuuçtu"));
    }
    /*
    Kullanıcıdan bir kelime/kelimeler alalım... kelime içindeki harf sayılarını
    başına yazarak oluşan stringi veren metodu yazalım.. (büyük/küçük harf göz ardı edilecek)
    //Hello  --- 1h1e2l1o
    //Merhaba  --- 1m1e1r1h2a1b
    //Ankaran  ---3a2n1k1r
     */

    //Ankaran  ----  küçük harfe çevir
    //ankaran  ----  3a   //lenght : 7   nkrn  length : 4  aradaki fark a'nın sayısı
    //nkrn  ---- 2n
    //kr ---- 1k
    //r   ---- 1r
    //--
    public static String harfleriSay(String str) {
        String result = "";
        str = str.toLowerCase().replace(" ", "");
        while (!str.isEmpty()) {
            String ilkHarf = str.substring(0, 1);
            int ilkHarfSayisi = str.length() - str.replace(ilkHarf, "").length();
            result += ilkHarfSayisi + ilkHarf;
            str = str.replace(ilkHarf,"");
        }
        return result;
    }

    // girilen string içerisindeki en çok bulunan harfi dönen metodu yazınız
    //Merhaba  ---- a
    //aaaaaaaaaaaassssssddd   --- a
    //hhhhhsssssssssssssssssddddddsssssssddddddddddssssssssssssssssssss  -- s

    public static String enCokHarf(String str){
        str = str.toLowerCase().replace(" ","");
        String result = "";
        int count = 0;
        //merhaba
        while (!str.isEmpty()){
            String ilkHarf = str.substring(0,1);
            int ilkHarfSayisi = str.length()-str.replace(ilkHarf,"").length();
            if (ilkHarfSayisi>count){
                result = ilkHarf;
                count = ilkHarfSayisi;
            }
            str = str.replace(ilkHarf,"");
        }

        return result;
    }
}
