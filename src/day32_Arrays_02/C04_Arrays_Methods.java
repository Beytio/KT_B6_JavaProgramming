package day32_Arrays_02;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods{

    public static String [] kelimeDepola(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. kelime :");
        String kelime1= scanner.nextLine();
        System.out.println("2. kelime :");
        String kelime2= scanner.nextLine();
        System.out.println("3. kelime :");
        String kelime3= scanner.nextLine();

        String [] kelimeler=new String[3];
        kelimeler[0]=kelime1;
        kelimeler[1]=kelime2;
        kelimeler[2]=kelime3;

        return kelimeler;
    }

    //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean uzunlukKontrol(int [] array){
        return array.length>5;
    }


    //Bir method yazın int array kabul etsin
    // array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean sayiKontrol(int [] array, int sayi){

        for (int x:array ) {
            if (x==sayi){
                return true;
            }
        }
        return false;
    }


    public static boolean sayiKontrol2(int []arr, int sayi){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==sayi){
                return true;
            }
        }
        return false;
    }




    // Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean ilkElemanEsitMi(int [] arr1,int []arr2){
        return arr1[0]==arr2[0];
    }

    public static boolean ilkElemanEsitMi(String [] arr1,String []arr2){
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }



    //2 array kabul eden bir method yazın ve arraylerin
    // llk elemanları ile yeni bir array döndürsün.

    public static int [] newArray(int []arr1, int []arr2){
        int [] abc=new int[2];
        abc[0]=arr1[0];
        abc[1]=arr2[0];

        return abc;
    }


    public static double [] newArray(double []arr1, double []arr2){
        double [] abc=new double[2];
        abc[0]=arr1[0];
        abc[1]=arr2[0];

        return abc;
    }



    //Int array in elemanlarının toplamını veren bir method yazın

    public static int arrayToplam(int [] arr){
        int sum=0;
        for (int x:arr ) {
          sum+=x;
        }
        return sum;
    }


    public static double arrayToplam(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }


    //İnt array ın elemanlarının toplamını ve çarpımını yeni
    // bir array içinde döndüren bir method yazın.

    public static int [] toplamVeÇarpım(int [] arr){
        int toplam=0;
        int çarpım=1;

        for (int x:arr ) {
            toplam+=x;
            çarpım*=x;
        }
        int [] newArray=new int[2];
        newArray[0]=toplam;
        newArray[1]=çarpım;

        return newArray;
    }


    public static int [] toplamVeÇarpım2(int [] arr){
        int [] newArray=new int[2];
        newArray[1]=1;

        for (int i = 0; i < arr.length; i++) {
            newArray[0]+=arr[i];
            newArray[1]*=arr[i];
        }

       return newArray;
    }


    // Verilen 2 arrayi birleştirip array döndüren bir method yazın.

    public static int [] arrayirlestir(int []arr1, int [] arr2){
        int [] newArray=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i]=arr1[i];
        }

        int j=0;
        for (int i = arr1.length; i < newArray.length; i++) {
            newArray[i]=arr2[j];
            j++;
        }


        return newArray;

    }



    public static void main(String[] args) {
     //   System.out.println(kelimeDepola()[0]);

        int [] sayilar=new int[5];
        sayilar[0]=45;
        sayilar[1]=42;
        sayilar[2]=12;
        sayilar[3]=23;
        sayilar[4]=54;

        int [] sayilar2=new int[6];
        sayilar2[0]=4;
        sayilar2[1]=42;
        sayilar2[2]=12;
        sayilar2[3]=23;
        sayilar2[4]=54;
        sayilar2[5]=34;

        System.out.println(uzunlukKontrol(sayilar2));

        System.out.println("-----------------");

        System.out.println(sayiKontrol2(sayilar2,23));

        System.out.println("---------------");
        System.out.println(ilkElemanEsitMi(sayilar, sayilar2));
        System.out.println("--------------------");
        System.out.println(Arrays.toString(newArray(sayilar, sayilar2)));

        System.out.println("-------------------------");
        System.out.println(arrayToplam(sayilar));

        System.out.println("----------------");

        System.out.println(toplamVeÇarpım(sayilar2)[0]);
        System.out.println(toplamVeÇarpım(sayilar2)[1]);
        System.out.println(Arrays.toString(toplamVeÇarpım(sayilar2)));

        System.out.println("----------------");

        System.out.println(toplamVeÇarpım2(sayilar2)[0]);
        System.out.println(toplamVeÇarpım2(sayilar2)[1]);
        System.out.println(Arrays.toString(toplamVeÇarpım2(sayilar2)));
    }

}
