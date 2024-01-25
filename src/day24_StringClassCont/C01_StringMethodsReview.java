package day24_StringClassCont;

import java.util.Scanner;

public class C01_StringMethodsReview {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz  : ");
        String isim = scanner.nextLine();
//charAt()
        char ilkHarf = isim.charAt(0);   //   Nisa                             Sadettin  -- 8
        int uzunluk = isim.length();       // 0123   ama uzunluğu kaç? 4       01234567  -- son indeks herzaman
        // uzunluk-1
        char sonharf = isim.charAt(uzunluk - 1);

        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("sonharf = " + sonharf);
        System.out.println("uzunluk = " + uzunluk);
*/
        String name = "Mustafa";
        char ikinciHarf = name.charAt(1);
        char sondanIkinciHarf = name.charAt(name.length()-2);

        System.out.println("ikinciHarf = " + ikinciHarf);
        System.out.println("sondanIkinciHarf = " + sondanIkinciHarf);

        //equals()
        String str1= "Ali";
        String str2= "Ali";
        boolean bl = str1.equals(str2);
        System.out.println("bl = " + bl);

        String str3= "ali";
        String str4= "Ali";
        boolean bl2 = str3.equals(str4);
        System.out.println("bl2 = " + bl2);
        //equalsIgnoreCase()
        boolean bl_4=str3.equalsIgnoreCase(str4);
        System.out.println("bl_4 = " + bl_4);

        System.out.println("---------------------");

        //toUpperCase()
        String str5= "ali";
        System.out.println("str5.toUpperCase() = " + str5.toUpperCase());
        System.out.println("str5 = " + str5);

        //stringler immutable yani değişmez...
        str5 = str5.toUpperCase();
        System.out.println("str5 = " + str5);

        System.out.println("---------------------");
        //trim()
        String ad = "         Ak            if      ";
        System.out.println("ad.trim() = " + ad.trim());
        System.out.println("ad = " + ad);

        System.out.println("---------------------");
        //toLowerCase()
        String memleket = "TRABZON";
        System.out.println("memleket.toLowerCase() = " + memleket.toLowerCase());
        System.out.println("memleket = " + memleket);

        //indexOf()
        // TRABZON da olmayan bir harf verildiğinden index -1 döner
        System.out.println("memleket.indexOf('C') = " + memleket.indexOf('C'));
        System.out.println("memleket.indexOf('Z') = " + memleket.indexOf('Z'));

        //lastIndexOf()
        String ulke = "Avusuuuujjjuuuturya";
        System.out.println("ulke.indexOf('u') = " + ulke.indexOf('u'));
        System.out.println("ulke.lastIndexOf('u') = " + ulke.lastIndexOf('u'));

        System.out.println("ulke.indexOf(\"uuu\") = " + ulke.indexOf("uuu"));
        System.out.println("ulke.lastIndexOf(\"uuu\") = " + ulke.lastIndexOf("uuu"));

        //replace()
        String meyve = "Armut";
        System.out.println("meyve.replace(\"u\",\"e\") = " + meyve.replace("u", "e"));
        System.out.println("meyve = " + meyve);

        System.out.println("meyve.replace(\"rmu\",\"zzz\") = " + meyve.replace("rmu", "zzz"));


        System.out.println("meyve.replace(\"rum\",\"yyy\") = " + meyve.replace("rum", "yyy"));

        String cumle = "      Ali bugün bakkaldan ekmek aldı             ";
        System.out.println("cumle.trim() = " + cumle.trim());

        System.out.println("cumle.replace(\" \",\"\") = " + cumle.replace(" ", ""));

        System.out.println("cumle = " + cumle);

        System.out.println("cumle.contains(\"bak\") = " + cumle.contains("bak"));
        System.out.println("cumle.contains(\"gün bak\") = " + cumle.contains("gün bak"));
        System.out.println("cumle.contains(\"bugün ek\") = " + cumle.contains("bugün ek"));

    }


}
