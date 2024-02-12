package day36_WrapperClasses;

public class C03_WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        // System.out.println(str*2);  // hata verir
        Integer i = Integer.valueOf(str);   // Integer olur
        System.out.println(i * 2);
        int j = Integer.parseInt(str);  // int olur
        System.out.println(j * 2);

        //ilk rakamını al
        int ilkRakam = Integer.parseInt(str.substring(0, 1));
        System.out.println("ilkRakam = " + ilkRakam);

        Integer integer = Integer.valueOf("256");
        System.out.println("integer = " + integer);

        String message = "Bugün hava 25 derece";
        System.out.println("message = " + message);
        // hava sıcaklığı 10 derece arttı. Mesajı düzeltin...
        String[] kelimeler = message.split(" ");
        int yeniSicaklik = Integer.parseInt(kelimeler[2]) + 10;
        kelimeler[2] = String.valueOf(yeniSicaklik);

        message = String.join(" ", kelimeler);
        System.out.println("message = " + message);


        // Sıcaklık mesajındaki rakam 40'dan büyükse "Bugün hava çok sıcak" yazdırsın.
        // değilse "Sıcaklık mevsim normallerinde." yazdırsın.

        String[] messageWords = message.split(" ");
        int sicaklikDurumu = Integer.parseInt(messageWords[2]);

        if (sicaklikDurumu>=40){
            System.out.println("Bugün hava çok sıcak.");
        }else {
            System.out.println("Sıcaklık mevsim normallerinde.");
        }


        //Ali'nin doğum yılı 1996 ise 10 yıl sonra Ali kaç yaşında olacaktır? Yazdıralım...
        String s = "Ali'nin doğum yılı 1996'dır";
        String[] words = s.split(" ");
        String dogumYili = words[3].split("'")[0];
        System.out.println("dogumYili = " + dogumYili);

        int dogumTarihi = Integer.parseInt(dogumYili);
        int alininOnYilSonrakiYasi = 2024-dogumTarihi+10;
        System.out.println("alininOnYilSonrakiYasi = " + alininOnYilSonrakiYasi);

    }
}
