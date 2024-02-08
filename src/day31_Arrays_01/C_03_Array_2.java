package day31_Arrays_01;

import java.util.Arrays;

public class C_03_Array_2 {
    public static void main(String[] args) {
        int [] rakamlar = new int[5];
        rakamlar[0] = 10;
        rakamlar[1] = 110;
        rakamlar[2] = 210;
        rakamlar[3] = 130;
        rakamlar[4] = 1170;

        System.out.println("rakamlar.length = " + rakamlar.length);

        System.out.println("rakamlar[3]+100 = " + (rakamlar[3] + 100));

        String [] cities = {"Bursa","Samsun","Uşak","Maraş"};

        System.out.println(cities[1].toLowerCase().replace("s", "F"));

        //  içine dört adet isim alan bir array yazınız
        // for each loop ile bu isimleri aralarında boşluk olmadan birleştirin

        String isimler [] = new String[4];
        isimler[0] = "Adem";
        isimler[2] = "İlhan";
        isimler[3] = "İlknur";
        isimler[1] = "Buket";

        System.out.println("isimler = " + isimler);

        String birlestirilmis = "";
        for (String isim : isimler) {
            birlestirilmis+= isim;
        }

        System.out.println("birlestirilmis = " + birlestirilmis);


        System.out.println("arrayTopla(rakamlar) = " + arrayTopla(rakamlar));

        System.out.println("girilenUcSayiArray(15,36,25) = " + girilenUcSayiArray(15, 36, 25));

        System.out.println(Arrays.toString(girilenUcSayiArray(15, 36, 25)));

        //Arerayler nasıl yazdırılır
        //ya loop ile teker teker yazdırılır
        // ya da Arrays.toString(yazdirilacakArray)  --- sout'un içine gönderilir..

        String [] countries = {"Çin","Rusya","ABD","İran","Belçika"};

        for (String country : countries) {
            System.out.println(country);
        }

        //Arrays metodu ile
        System.out.println(Arrays.toString(countries));


        //içine 6 adet sayı alan bir array yazalım
        // for each ile sadece tek sayıları yazdıralım..

        int [] nums = {11,15,36,20,25,23};

        for (int num : nums) {
            if (num % 2 == 1){
                System.out.println(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){
                System.out.println(nums[i]);
            }
        }

        String [] students = new String[6];
        students[0] = "Burhan";
        students[1] = "Harun";
        students[4] = "Tolga";
        students[5] = "Şermin";
        students[2] = "Nisa";
        students[3] = "Tuğba";

        for (String student : students) {
            System.out.println(student+" çalışkan bir öğrencidir.");
        }

        //sırayla isimleri yazalım... tolgaya gelince Tolga burada yazsın
        // ve geride kalan isimler yazılmasın

        for (String student : students) {
        //    System.out.println(student);
            if (student.equals("Tolga")){
                System.out.println("Tolga burada");
                break;
            }
            System.out.println(student);
        }


    }

    public static int arrayTopla (int [] arr){
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return toplam;
    }

    public static int [] girilenUcSayiArray (int x, int y, int z){
        int result [] = new int[3];
        result[0] = x;
        result[1] = y;
        result[2] = z;

        return result;
    }
}
