package day31_Arrays;

public class C02_ArraysIntro {
    public static void main(String[] args) {
        String name = "Ali";
        //deklare etme ve boyut belirleme


        int age=4;

        int [] intArr1 = new int[10];

        String strArr [] = new String[8];

        double[] doubleArr = new double[25];

        int intArr [];
        intArr = new int[6];

        intArr[0] = 5;
        intArr[1] = -4;
        intArr[2] = 12;
        intArr[3] = -154;
        intArr[4] = 77;
        intArr[5] = 0;

        int [] numbers = {2,89,36,-9,33};
        numbers[3]= -19;
       // numbers[5] = 63;




        // boyu 6 olan bir int array oluşturun ve
        // 2 nci ve 5 nci indexlerine 30 sayısını atayın ve yazdırın

       int nums [] = new int[6];
       nums[2] = 30;
       nums[5] = 30;

        System.out.println("nums[2] = " + nums[2]);
        System.out.println("nums[5] = " + nums[5]);
        System.out.println("nums[0] = " + nums[0]);

        // 2 int değer alan bir array oluşturun
        //değerlerini 15 ve 25 olarak girin
        //sonra toplayarak ekarana toplamı yazdırın

        int z [] = new int[2];
        z[0] = 15;
        z[1] = 25;

        System.out.println(z[0]+z[1]);

        String names [] = {"Ahmet","Erdi","Halis","Eda","Şule","Makbule","Serap"};
        System.out.println("names[3] = " + names[3]);
        System.out.println("names[6] = " + names[6]);
        names[6] = "Mehtap";
        System.out.println("names[6] = " + names[6]);

        int boy = names.length;
        System.out.println("boy = " + boy);

        String adSoyad = "Ali Akça";
        int uzunluk = adSoyad.length();
        System.out.println("uzunluk = " + uzunluk);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for each loop
        for (String ad:names) {
            System.out.println(ad+"***");
        }

        //bir int array oluşturun... 5 sayı alsın
        // bu sayıları foor each ile yazdırın..
        int [] rakamlar = new int[5];
        rakamlar[0] = 10;
        rakamlar[1] = 110;
        rakamlar[2] = 210;
        rakamlar[3] = 130;
        rakamlar[4] = 1170;

        for (int rakam : rakamlar) {
            System.out.println(rakam);
        }

    }
}
