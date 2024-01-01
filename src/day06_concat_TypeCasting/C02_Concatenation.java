package day06_concat_TypeCasting;

public class C02_Concatenation {
    public static void main(String[] args) {
        // Stringlerde iki ifade birbirine + ile eklenir.

        String name = "Ahmet";
        String surname = "Yılmaz";
        String telephoneNumber = "5431212121212";
        String space = " ";

        System.out.println("İhsan" + " " + "Akçair");

        System.out.println(name + " " + surname + " " + telephoneNumber);
        System.out.println(name + space + surname + space + telephoneNumber);

        //bir veri string ile toplanırsa, stringe dönüşür..

        System.out.println("Mustafa" + 25);

        String avatar = "Ali" + 66;

        System.out.println(avatar);

        System.out.println(20 + 30);

        System.out.println("Fehmi" + 20 + 30);
        System.out.println("Fehmi" + (20 + 30));
        System.out.println("Fehmi" + 20 * 30);
        System.out.println(20 + 30 + "Fehmi" + 20 / 30);
        //20+30+"Fehmi"+0
        //50+"Fehmi"+0
        //"50Fehmi"+0
        //"50Fehmi0"

        System.out.println(20 + 30 + "Fehmi" + 50 + 20 / 30);
        //20+30+"Fehmi"+50+0
        //50+"Fehmi"+50+0
        //"50Fehmi"+50+0
        //"50Fehmi50"+0
        //"50Fehmi500"

        //işlem önceliği
        // 1- () parantez
        //2- * , /, mod
        //3- + , -

        // aynı önvelik varsa önce soldaki yapılır.


        System.out.println((20 + 20) + (30 / 5) + "Fehmi" + (30 + 20 / 3));
        //  40+6+"Fehmi"+(30+6)
        //46+"Fehmi"+36
        //"46Fehmi36"

        System.out.println("Ali" + (20 + 20) + (30 / 5) + "Fehmi" + (30 + 20 / 3));

        //"Ali"+40+6+"Fehmi"+(30+6)
        //"Ali"+40+6+"Fehmi"+36
        //"Ali40"+6+"Fehmi"+36
        //"Ali406"+"Fehmi"+36
        //"Ali406Fehmi"+36
        //Ali406Fehmi36

        String str = "";
        String str2 = null;

        System.out.println(str + 25 + 90);
        System.out.println("" + 25 + 90);

        String str3 = "25";
        String str4 = "2590";

        System.out.println("" + (25 + 90));
        String str5 = "115";

    }
}
