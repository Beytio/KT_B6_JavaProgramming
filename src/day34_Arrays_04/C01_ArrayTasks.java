package day34_Arrays_04;

import java.util.Arrays;

public class C01_ArrayTasks {
    public static void main(String[] args) {
        String str = "Bugün hava çok güzel";
        String[] words = str.split(" ");

        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        String city = "Burdur";
        String [] arr = city.split("u");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


         String [] harfler = city.split("");
        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler));

        //toCharArray()
        char [] chars = city.toCharArray();
        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
        System.out.println(chars);

        System.out.println("chars[2] = " + chars[2]);

        String[] cumleArr = kelimeler("Abim bugün ameliyat oldu");
        System.out.println(Arrays.toString(cumleArr));

        System.out.println(Arrays.toString(meyveler("kayısı armut üzüm muz erik çilek nar")));

    }

    //Girilen cümleyi kelimelere bölerek bir arraye atayan metodu yazınız

    /**
     * bu metod cumleyi kelime arrayine çevirir.
     * @param cumle
     * @return
     */
    public static String [] kelimeler (String cumle){
        String [] result  = cumle.split(" ");
        return result;
    }

    // kayısı armut üzüm çilek nar'dan oluşan cümleyi bir arraye alalım.
    // elementlerden 5 den az harfi olanlar varsa yerine armut yazalım

    public static String [] meyveler(String meyveCumlesi){
        String [] result = meyveCumlesi.split(" ");
        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length; i++) {
            if (result[i].length()<5){
                result[i] = "armut";
            }
        }

        return result;
    }

}
